package com.ruoyi.ee.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ee.mapper.CwDetailMapper;
import com.ruoyi.ee.domain.CwDetail;
import com.ruoyi.ee.service.IOutdoorService;
import com.ruoyi.common.core.text.Convert;

/**
 * 外勤明细Service业务层处理
 * 
 * @author hui
 * @date 2021-04-09
 */
@Service
public class OutdoorServiceImpl implements IOutdoorService
{
    @Autowired
    private CwDetailMapper cwDetailMapper;

    /**
     * 查询外勤明细
     * 
     * @param cwDetailId 外勤明细ID
     * @return 外勤明细
     */
    @Override
    public CwDetail selectCwDetailById(Long cwDetailId)
    {
        return cwDetailMapper.selectCwDetailById(cwDetailId);
    }

    /**
     * 查询外勤明细列表
     * 
     * @param cwDetail 外勤明细
     * @return 外勤明细
     */
    @Override
    public List<CwDetail> selectCwDetailList(CwDetail cwDetail)
    {
        return cwDetailMapper.selectCwDetailList(cwDetail);
    }

    /**
     * 新增外勤明细
     * 
     * @param cwDetail 外勤明细
     * @return 结果
     */
    @Override
    public int insertCwDetail(CwDetail cwDetail)
    {
        return cwDetailMapper.insertCwDetail(cwDetail);
    }

    /**
     * 修改外勤明细
     * 
     * @param cwDetail 外勤明细
     * @return 结果
     */
    @Override
    public int updateCwDetail(CwDetail cwDetail)
    {
        return cwDetailMapper.updateCwDetail(cwDetail);
    }

    /**
     * 删除外勤明细对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteCwDetailByIds(String ids)
    {
        return cwDetailMapper.deleteCwDetailByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除外勤明细信息
     * 
     * @param cwDetailId 外勤明细ID
     * @return 结果
     */
    @Override
    public int deleteCwDetailById(Long cwDetailId)
    {
        return cwDetailMapper.deleteCwDetailById(cwDetailId);
    }
}
