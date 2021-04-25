package com.ruoyi.ee.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 请假明细对象 wf_holiday_item
 * 
 * @author hui
 * @date 2021-03-26
 */
public class WfHolidayItem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long wfHolidayItemId;

    /** $column.columnComment */
    @Excel(name = "备注")
    private Long wfHolidayId;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm" ,timezone="GMT+8")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fromDate;

    /** 截止时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm" ,timezone="GMT+8")
    @Excel(name = "截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date toDate;

    /** 天数小计 */
    @Excel(name = "天数小计")
    private Double daySum;

    /** 时数小计 */
    @Excel(name = "时数小计")
    private Long hourSum;

    /** 扣款方式 2扣薪   0 不扣薪 （不动声色） */
    @Excel(name = "扣款方式", readConverterExp = "不动声色")
    private Long payWay;

    /** 类型 */
    @Excel(name = "类型")
    private Long hritemsId;

    /** 假期类型 1全天假 2半天假 3小时假 */
    @Excel(name = "假期类型 1全天假 2半天假 3小时假")
    private Long holidayType;

    public void setWfHolidayItemId(Long wfHolidayItemId) 
    {
        this.wfHolidayItemId = wfHolidayItemId;
    }

    public Long getWfHolidayItemId() 
    {
        return wfHolidayItemId;
    }
    public void setWfHolidayId(Long wfHolidayId) 
    {
        this.wfHolidayId = wfHolidayId;
    }

    public Long getWfHolidayId() 
    {
        return wfHolidayId;
    }
    public void setFromDate(Date fromDate) 
    {
        this.fromDate = fromDate;
    }

    public Date getFromDate() 
    {
        return fromDate;
    }
    public void setToDate(Date toDate) 
    {
        this.toDate = toDate;
    }

    public Date getToDate() 
    {
        return toDate;
    }
    public void setDaySum(Double daySum)
    {
        this.daySum = daySum;
    }

    public Double getDaySum()
    {
        return daySum;
    }
    public void setHourSum(Long hourSum) 
    {
        this.hourSum = hourSum;
    }

    public Long getHourSum() 
    {
        return hourSum;
    }
    public void setPayWay(Long payWay) 
    {
        this.payWay = payWay;
    }

    public Long getPayWay() 
    {
        return payWay;
    }
    public void setHritemsId(Long hritemsId) 
    {
        this.hritemsId = hritemsId;
    }

    public Long getHritemsId() 
    {
        return hritemsId;
    }
    public void setHolidayType(Long holidayType) 
    {
        this.holidayType = holidayType;
    }

    public Long getHolidayType() 
    {
        return holidayType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("wfHolidayItemId", getWfHolidayItemId())
            .append("wfHolidayId", getWfHolidayId())
            .append("fromDate", getFromDate())
            .append("toDate", getToDate())
            .append("daySum", getDaySum())
            .append("hourSum", getHourSum())
            .append("remark", getRemark())
            .append("payWay", getPayWay())
            .append("hritemsId", getHritemsId())
            .append("holidayType", getHolidayType())
            .toString();
    }
}
