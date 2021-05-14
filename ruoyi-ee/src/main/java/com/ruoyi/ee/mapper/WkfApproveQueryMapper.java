package com.ruoyi.ee.mapper;

import java.util.List;
import com.ruoyi.ee.domain.WkfApproveQuery;

/**
 * 审批Mapper接口
 * 
 * @author hui
 * @date 2021-04-21
 */
public interface WkfApproveQueryMapper 
{
    /**
     * 查询审批
     * 
     * @param processInsId 审批ID
     * @return 审批
     */
    public WkfApproveQuery selectWkfApproveQueryById(Long processInsId);

    /**
     * 查询审批列表
     * 
     * @param wkfApproveQuery 审批
     * @return 审批集合
     */
    public List<WkfApproveQuery> selectWkfApproveQueryList(WkfApproveQuery wkfApproveQuery);

    /**
     * 新增审批
     * 
     * @param wkfApproveQuery 审批
     * @return 结果
     */
    public int insertWkfApproveQuery(WkfApproveQuery wkfApproveQuery);

    /**
     * 修改审批
     * 
     * @param wkfApproveQuery 审批
     * @return 结果
     */
    public int updateWkfApproveQuery(WkfApproveQuery wkfApproveQuery);

    /**
     * 删除审批
     * 
     * @param processInsId 审批ID
     * @return 结果
     */
    public int deleteWkfApproveQueryById(Long processInsId);

    /**
     * 批量删除审批
     * 
     * @param processInsIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteWkfApproveQueryByIds(String[] processInsIds);

    public Long getHolidayIdByProcessInsId(Long processInsId);
    public Long getOtIdByProcessInsId(Long processInsId);
    public Long getOutWorkIdByProcessInsId(Long processInsId);
}
