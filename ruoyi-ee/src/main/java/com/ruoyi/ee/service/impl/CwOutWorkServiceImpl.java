package com.ruoyi.ee.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.ee.domain.CwOutWorkitem;
import com.ruoyi.ee.mapper.CwOutWorkMapper;
import com.ruoyi.ee.domain.CwOutWork;
import com.ruoyi.ee.service.ICwOutWorkService;
import com.ruoyi.common.core.text.Convert;

/**
 * 出差Service业务层处理
 * 
 * @author hui
 * @date 2021-04-09
 */
@Service
public class CwOutWorkServiceImpl implements ICwOutWorkService 
{
    @Autowired
    private CwOutWorkMapper cwOutWorkMapper;

    /**
     * 查询出差
     * 
     * @param cwOutWorkId 出差ID
     * @return 出差
     */
    @Override
    public CwOutWork selectCwOutWorkById(Long cwOutWorkId)
    {
        return cwOutWorkMapper.selectCwOutWorkById(cwOutWorkId);
    }

    /**
     * 查询出差列表
     * 
     * @param cwOutWork 出差
     * @return 出差
     */
    @Override
    public List<CwOutWork> selectCwOutWorkList(CwOutWork cwOutWork)
    {
        return cwOutWorkMapper.selectCwOutWorkList(cwOutWork);
    }

    /**
     * 新增出差
     * 
     * @param cwOutWork 出差
     * @return 结果
     */
    @Transactional
    @Override
    public int insertCwOutWork(CwOutWork cwOutWork)
    {
        int rows = cwOutWorkMapper.insertCwOutWork(cwOutWork);
        insertCwOutWorkitem(cwOutWork);
        return rows;
    }

    /**
     * 修改出差
     * 
     * @param cwOutWork 出差
     * @return 结果
     */
    @Transactional
    @Override
    public int updateCwOutWork(CwOutWork cwOutWork)
    {
        cwOutWorkMapper.deleteCwOutWorkitemByCwOutWorkId(cwOutWork.getCwOutWorkId());
        insertCwOutWorkitem(cwOutWork);
        return cwOutWorkMapper.updateCwOutWork(cwOutWork);
    }

    /**
     * 删除出差对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteCwOutWorkByIds(String ids)
    {
        cwOutWorkMapper.deleteCwOutWorkitemByCwOutWorkIds(Convert.toStrArray(ids));
        return cwOutWorkMapper.deleteCwOutWorkByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除出差信息
     * 
     * @param cwOutWorkId 出差ID
     * @return 结果
     */
    @Override
    public int deleteCwOutWorkById(Long cwOutWorkId)
    {
        cwOutWorkMapper.deleteCwOutWorkitemByCwOutWorkId(cwOutWorkId);
        return cwOutWorkMapper.deleteCwOutWorkById(cwOutWorkId);
    }

    /**
     * 新增${subTable.functionName}信息
     * 
     * @param cwOutWork 出差对象
     */
    public void insertCwOutWorkitem(CwOutWork cwOutWork)
    {
        List<CwOutWorkitem> cwOutWorkitemList = cwOutWork.getCwOutWorkitemList();
        Long cwOutWorkId = cwOutWork.getCwOutWorkId();
        if (StringUtils.isNotNull(cwOutWorkitemList))
        {
            List<CwOutWorkitem> list = new ArrayList<CwOutWorkitem>();
            for (CwOutWorkitem cwOutWorkitem : cwOutWorkitemList)
            {
                cwOutWorkitem.setCwOutWorkId(cwOutWorkId);
                list.add(cwOutWorkitem);
            }
            if (list.size() > 0)
            {
                cwOutWorkMapper.batchCwOutWorkitem(list);
            }
        }
    }
}
