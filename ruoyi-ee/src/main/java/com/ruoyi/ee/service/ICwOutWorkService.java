package com.ruoyi.ee.service;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ee.domain.CwOutWork;

/**
 * 出差Service接口
 * 
 * @author hui
 * @date 2021-04-09
 */
public interface ICwOutWorkService 
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
     * 批量删除出差
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCwOutWorkByIds(String ids);
    public AjaxResult cancelApply(Long cwOutWorkId);
    /**
     * 删除出差信息
     * 
     * @param cwOutWorkId 出差ID
     * @return 结果
     */
    public int deleteCwOutWorkById(Long cwOutWorkId);
}
