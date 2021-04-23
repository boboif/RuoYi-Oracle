package com.ruoyi.ee.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ee.mapper.WkfApproveQueryMapper;
import com.ruoyi.ee.domain.WkfApproveQuery;
import com.ruoyi.ee.service.IWkfApproveService;
import com.ruoyi.common.core.text.Convert;

/**
 * 审批Service业务层处理
 * 
 * @author hui
 * @date 2021-04-21
 */
@Service
public class WkfApproveServiceImpl implements IWkfApproveService
{
    @Autowired
    private WkfApproveQueryMapper wkfApproveQueryMapper;

    /**
     * 查询审批
     * 
     * @param processInsId 审批ID
     * @return 审批
     */
    @Override
    public WkfApproveQuery selectWkfApproveById(Long processInsId)
    {
        return wkfApproveQueryMapper.selectWkfApproveQueryById(processInsId);
    }

    /**
     * 查询审批列表
     * 
     * @param wkfApproveQuery 审批
     * @return 审批
     */
    @Override
    public List<WkfApproveQuery> selectWkfApproveList(WkfApproveQuery wkfApproveQuery)
    {
        return wkfApproveQueryMapper.selectWkfApproveQueryList(wkfApproveQuery);
    }

    /**
     * 新增审批
     * 
     * @param wkfApproveQuery 审批
     * @return 结果
     */
    @Override
    public int insertWkfApprove(WkfApproveQuery wkfApproveQuery)
    {
        return wkfApproveQueryMapper.insertWkfApproveQuery(wkfApproveQuery);
    }

    /**
     * 修改审批
     * 
     * @param wkfApproveQuery 审批
     * @return 结果
     */
    @Override
    public int updateWkfApprove(WkfApproveQuery wkfApproveQuery)
    {
        return wkfApproveQueryMapper.updateWkfApproveQuery(wkfApproveQuery);
    }

    /**
     * 删除审批对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWkfApproveByIds(String ids)
    {
        return wkfApproveQueryMapper.deleteWkfApproveQueryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除审批信息
     * 
     * @param processInsId 审批ID
     * @return 结果
     */
    @Override
    public int deleteWkfApproveById(Long processInsId)
    {
        return wkfApproveQueryMapper.deleteWkfApproveQueryById(processInsId);
    }
}
