package com.ruoyi.ee.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * ${subTable.functionName}对象 cw_out_workitem
 * 
 * @author hui
 * @date 2021-04-09
 */
public class CwOutWorkitem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long cwOutWorkitemId;

    /** $column.columnComment */
    @Excel(name = "预支金额")
    private Long cwOutWorkId;

    /** $column.columnComment */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预支金额", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fromDate;

    /** $column.columnComment */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "预支金额", width = 30, dateFormat = "yyyy-MM-dd")
    private Date toDate;

    /** $column.columnComment */
    @Excel(name = "预支金额")
    private Long daySum;

    /** $column.columnComment */
    @Excel(name = "预支金额")
    private Long hourSum;

    /** $column.columnComment */
    @Excel(name = "预支金额")
    private Long hritemsId;

    public void setCwOutWorkitemId(Long cwOutWorkitemId) 
    {
        this.cwOutWorkitemId = cwOutWorkitemId;
    }

    public Long getCwOutWorkitemId() 
    {
        return cwOutWorkitemId;
    }
    public void setCwOutWorkId(Long cwOutWorkId) 
    {
        this.cwOutWorkId = cwOutWorkId;
    }

    public Long getCwOutWorkId() 
    {
        return cwOutWorkId;
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
    public void setDaySum(Long daySum) 
    {
        this.daySum = daySum;
    }

    public Long getDaySum() 
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
    public void setHritemsId(Long hritemsId) 
    {
        this.hritemsId = hritemsId;
    }

    public Long getHritemsId() 
    {
        return hritemsId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cwOutWorkitemId", getCwOutWorkitemId())
            .append("cwOutWorkId", getCwOutWorkId())
            .append("fromDate", getFromDate())
            .append("toDate", getToDate())
            .append("daySum", getDaySum())
            .append("hourSum", getHourSum())
            .append("remark", getRemark())
            .append("hritemsId", getHritemsId())
            .toString();
    }
}
