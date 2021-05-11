package com.ruoyi.ee.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.ee.domain.WfHoliday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.ee.domain.CwExtraWorkitem;
import com.ruoyi.ee.mapper.CwExtraWorkMapper;
import com.ruoyi.ee.domain.CwExtraWork;
import com.ruoyi.ee.service.ICwExtraWorkService;
import com.ruoyi.common.core.text.Convert;

/**
 * 加班管理Service业务层处理
 * 
 * @author hui
 * @date 2021-04-09
 */
@Service
public class CwExtraWorkServiceImpl implements ICwExtraWorkService 
{
    @Autowired
    private CwExtraWorkMapper cwExtraWorkMapper;

    /**
     * 查询加班管理
     * 
     * @param cwExtraWorkId 加班管理ID
     * @return 加班管理
     */
    @Override
    public CwExtraWork selectCwExtraWorkById(Long cwExtraWorkId)
    {
        return cwExtraWorkMapper.selectCwExtraWorkById(cwExtraWorkId);
    }

    /**
     * 查询加班管理列表
     * 
     * @param cwExtraWork 加班管理
     * @return 加班管理
     */
    @Override
    public List<CwExtraWork> selectCwExtraWorkList(CwExtraWork cwExtraWork)
    {
        return cwExtraWorkMapper.selectCwExtraWorkList(cwExtraWork);
    }

    /**
     * 新增加班管理
     * 
     * @param cwExtraWork 加班管理
     * @return 结果
     */
    @Transactional
    @Override
    public int insertCwExtraWork(CwExtraWork cwExtraWork)
    {
        int rows = cwExtraWorkMapper.insertCwExtraWork(cwExtraWork);
        insertCwExtraWorkitem(cwExtraWork);
        return rows;
    }

    /**
     * 修改加班管理
     * 
     * @param cwExtraWork 加班管理
     * @return 结果
     */
    @Transactional
    @Override
    public int updateCwExtraWork(CwExtraWork cwExtraWork)
    {
        cwExtraWorkMapper.deleteCwExtraWorkitemByCwExtraWorkId(cwExtraWork.getCwExtraWorkId());
        cwExtraWork.setUpdateTime(DateUtils.getNowDate());
        insertCwExtraWorkitem(cwExtraWork);
        return cwExtraWorkMapper.updateCwExtraWork(cwExtraWork);
    }

    /**
     * 删除加班管理对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCwExtraWorkByIds(String ids)
    {
        cwExtraWorkMapper.deleteCwExtraWorkitemByCwExtraWorkIds(Convert.toStrArray(ids));
        return cwExtraWorkMapper.deleteCwExtraWorkByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除加班管理信息
     * 
     * @param cwExtraWorkId 加班管理ID
     * @return 结果
     */
    @Override
    public int deleteCwExtraWorkById(Long cwExtraWorkId)
    {
        cwExtraWorkMapper.deleteCwExtraWorkitemByCwExtraWorkId(cwExtraWorkId);
        return cwExtraWorkMapper.deleteCwExtraWorkById(cwExtraWorkId);
    }

    @Override
    public AjaxResult cancelApply(Long cwExtraWorkId) {
        CwExtraWork cwExtraWork = cwExtraWorkMapper.selectCwExtraWorkById(cwExtraWorkId);
        if(cwExtraWork.getStatus()!=1){
            return  AjaxResult.error("当前申请已不在申请中，无法驳回");
        }

        cwExtraWork.setStatus(0L);
        cwExtraWorkMapper.updateCwExtraWork(cwExtraWork);
        return AjaxResult.success("申请撤回成功！");

    }


    /**
     * 新增考勤 加班管理信息
     * 
     * @param cwExtraWork 加班管理对象
     */
    public void insertCwExtraWorkitem(CwExtraWork cwExtraWork)
    {
        List<CwExtraWorkitem> cwExtraWorkitemList = cwExtraWork.getCwExtraWorkitemList();
        Long cwExtraWorkId = cwExtraWork.getCwExtraWorkId();
        if (StringUtils.isNotNull(cwExtraWorkitemList))
        {
            List<CwExtraWorkitem> list = new ArrayList<CwExtraWorkitem>();
            for (CwExtraWorkitem cwExtraWorkitem : cwExtraWorkitemList)
            {
                cwExtraWorkitem.setCwExtraWorkId(cwExtraWorkId);
                list.add(cwExtraWorkitem);
            }
            if (list.size() > 0)
            {
                cwExtraWorkMapper.batchCwExtraWorkitem(list);
            }
        }
    }
}
