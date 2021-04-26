package com.ruoyi.ee.service;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.ee.domain.WfHoliday;

/**
 * 假期申请Service接口
 * 
 * @author hui
 * @date 2021-03-26
 */
public interface IWfHolidayService 
{
    /**
     * 查询假期申请
     * 
     * @param wfHolidayId 假期申请ID
     * @return 假期申请
     */
    public WfHoliday selectWfHolidayById(Long wfHolidayId);

    /**
     * 查询假期申请列表
     * 
     * @param wfHoliday 假期申请
     * @return 假期申请集合
     */
    public List<WfHoliday> selectWfHolidayList(WfHoliday wfHoliday);

    /**
     * 新增假期申请
     * 
     * @param wfHoliday 假期申请
     * @return 结果
     */
    public int insertWfHoliday(WfHoliday wfHoliday);

    /**
     * 修改假期申请
     * 
     * @param wfHoliday 假期申请
     * @return 结果
     */
    public int updateWfHoliday(WfHoliday wfHoliday);

    /**
     * 批量删除假期申请
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWfHolidayByIds(String ids);

    /**
     * 删除假期申请信息
     * 
     * @param wfHolidayId 假期申请ID
     * @return 结果
     */
    public int deleteWfHolidayById(Long wfHolidayId);

    public AjaxResult cancelApply(Long wfHolidayId);
}
