package com.ruoyi.ee.mapper;

import java.util.List;
import com.ruoyi.ee.domain.CwOutWork;
import com.ruoyi.ee.domain.CwOutWorkitem;

/**
 * 出差Mapper接口
 * 
 * @author hui
 * @date 2021-04-09
 */
public interface CwOutWorkMapper 
{
    /**
     * 查询出差
     * 
     * @param cwOutWorkId 出差ID
     * @return 出差
     */
    public CwOutWork selectCwOutWorkById(Long cwOutWorkId);

    /**
     * 查询出差列表
     * 
     * @param cwOutWork 出差
     * @return 出差集合
     */
    public List<CwOutWork> selectCwOutWorkList(CwOutWork cwOutWork);

    /**
     * 新增出差
     * 
     * @param cwOutWork 出差
     * @return 结果
     */
    public int insertCwOutWork(CwOutWork cwOutWork);

    /**
     * 修改出差
     * 
     * @param cwOutWork 出差
     * @return 结果
     */
    public int updateCwOutWork(CwOutWork cwOutWork);

    /**
     * 删除出差
     * 
     * @param cwOutWorkId 出差ID
     * @return 结果
     */
    public int deleteCwOutWorkById(Long cwOutWorkId);

    /**
     * 批量删除出差
     * 
     * @param cwOutWorkIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCwOutWorkByIds(String[] cwOutWorkIds);

    /**
     * 批量删除${subTable.functionName}
     * 
     * @param customerIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCwOutWorkitemByCwOutWorkIds(String[] cwOutWorkIds);
    
    /**
     * 批量新增${subTable.functionName}
     * 
     * @param cwOutWorkitemList ${subTable.functionName}列表
     * @return 结果
     */
    public int batchCwOutWorkitem(List<CwOutWorkitem> cwOutWorkitemList);
    

    /**
     * 通过出差ID删除${subTable.functionName}信息
     * 
     * @param roleId 角色ID
     * @return 结果
     */
    public int deleteCwOutWorkitemByCwOutWorkId(Long cwOutWorkId);
}
