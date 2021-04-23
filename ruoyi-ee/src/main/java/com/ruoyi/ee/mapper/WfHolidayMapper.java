package com.ruoyi.ee.mapper;

import java.util.List;
import com.ruoyi.ee.domain.WfHoliday;
import com.ruoyi.ee.domain.WfHolidayItem;

/**
 * 假期申请Mapper接口
 * 
 * @author hui
 * @date 2021-03-26
 */
public interface WfHolidayMapper 
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
     * 删除假期申请
     * 
     * @param wfHolidayId 假期申请ID
     * @return 结果
     */
    public int deleteWfHolidayById(Long wfHolidayId);

    /**
     * 批量删除假期申请
     * 
     * @param wfHolidayIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteWfHolidayByIds(String[] wfHolidayIds);

    /**
     * 批量删除请假明细
     * 
     * @param customerIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteWfHolidayItemByWfHolidayIds(String[] wfHolidayIds);
    
    /**
     * 批量新增请假明细
     * 
     * @param wfHolidayItemList 请假明细列表
     * @return 结果
     */
    public int batchWfHolidayItem(List<WfHolidayItem> wfHolidayItemList);
    

    /**
     * 通过假期申请ID删除请假明细信息
     * 
     * @param
     * @return 结果
     */
    public int deleteWfHolidayItemByWfHolidayId(Long wfHolidayId);
}
