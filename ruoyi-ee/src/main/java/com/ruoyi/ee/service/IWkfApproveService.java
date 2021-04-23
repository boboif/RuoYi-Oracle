package com.ruoyi.ee.service;

import java.util.List;
import com.ruoyi.ee.domain.WkfApproveQuery;

/**
 * 审批Service接口
 * 
 * @author hui
 * @date 2021-04-21
 */
public interface IWkfApproveService
{
    /**
     * 查询审批
     * 
     * @param processInsId 审批ID
     * @return 审批
     */
    public WkfApproveQuery selectWkfApproveById(Long processInsId);

    /**
     * 查询审批列表
     * 
     * @param wkfApproveQuery 审批
     * @return 审批集合
     */
    public List<WkfApproveQuery> selectWkfApproveList(WkfApproveQuery wkfApproveQuery);

    /**
     * 新增审批
     * 
     * @param wkfApproveQuery 审批
     * @return 结果
     */
    public int insertWkfApprove(WkfApproveQuery wkfApproveQuery);

    /**
     * 修改审批
     * 
     * @param wkfApproveQuery 审批
     * @return 结果
     */
    public int updateWkfApprove(WkfApproveQuery wkfApproveQuery);

    /**
     * 批量删除审批
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWkfApproveByIds(String ids);

    /**
     * 删除审批信息
     * 
     * @param processInsId 审批ID
     * @return 结果
     */
    public int deleteWkfApproveById(Long processInsId);
}
