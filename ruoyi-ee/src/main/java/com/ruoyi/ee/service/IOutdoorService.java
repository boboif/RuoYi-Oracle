package com.ruoyi.ee.service;

import java.util.List;
import com.ruoyi.ee.domain.CwDetail;

/**
 * 外勤明细Service接口
 * 
 * @author hui
 * @date 2021-04-09
 */
public interface IOutdoorService
{
    /**
     * 查询外勤明细
     * 
     * @param cwDetailId 外勤明细ID
     * @return 外勤明细
     */
    public CwDetail selectCwDetailById(Long cwDetailId);

    /**
     * 查询外勤明细列表
     * 
     * @param cwDetail 外勤明细
     * @return 外勤明细集合
     */
    public List<CwDetail> selectCwDetailList(CwDetail cwDetail);

    /**
     * 新增外勤明细
     * 
     * @param cwDetail 外勤明细
     * @return 结果
     */
    public int insertCwDetail(CwDetail cwDetail);

    /**
     * 修改外勤明细
     * 
     * @param cwDetail 外勤明细
     * @return 结果
     */
    public int updateCwDetail(CwDetail cwDetail);

    /**
     * 批量删除外勤明细
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCwDetailByIds(String ids);

    /**
     * 删除外勤明细信息
     * 
     * @param cwDetailId 外勤明细ID
     * @return 结果
     */
    public int deleteCwDetailById(Long cwDetailId);
}
