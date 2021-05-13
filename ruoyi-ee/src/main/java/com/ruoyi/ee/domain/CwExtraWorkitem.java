package com.ruoyi.ee.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 考勤 加班管理对象 cw_extra_workitem
 * 
 * @author hui
 * @date 2021-04-09
 */
public class CwExtraWorkitem extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long cwExtraWorkitemId;

    /** $column.columnComment */
    @Excel(name = "加班类型")
    private Long cwExtraWorkId;

    /** $column.columnComment */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "加班类型", width = 30, dateFormat = "yyyy-MM-dd")
    private Date toDate;

    /** $column.columnComment */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "加班类型", width = 30, dateFormat = "yyyy-MM-dd")
    private Date fromDate;

    /** $column.columnComment */
    @Excel(name = "加班类型")
    private Double daySum;

    /** $column.columnComment */
    @Excel(name = "加班类型")
    private Double hourSum;

    /** 加班工资的倍数 */
    @Excel(name = "加班工资的倍数")
    private Long benefitDouble;

    /** $column.columnComment */
    @Excel(name = "加班工资的倍数")
    private Long hritemsId;

    /** 补偿方式 0不动声色 1补薪 2调休 */
    @Excel(name = "补偿方式 0不动声色 1补薪 2调休")
    private Long payWay;

    public void setCwExtraWorkitemId(Long cwExtraWorkitemId) 
    {
        this.cwExtraWorkitemId = cwExtraWorkitemId;
    }

    public Long getCwExtraWorkitemId() 
    {
        return cwExtraWorkitemId;
    }
    public void setCwExtraWorkId(Long cwExtraWorkId) 
    {
        this.cwExtraWorkId = cwExtraWorkId;
    }

    public Long getCwExtraWorkId() 
    {
        return cwExtraWorkId;
    }
    public void setToDate(Date toDate) 
    {
        this.toDate = toDate;
    }

    public Date getToDate() 
    {
        return toDate;
    }
    public void setFromDate(Date fromDate) 
    {
        this.fromDate = fromDate;
    }

    public Date getFromDate() 
    {
        return fromDate;
    }
    public void setDaySum(Double daySum)
    {
        this.daySum = daySum;
    }

    public Double getDaySum()
    {
        return daySum;
    }
    public void setHourSum(Double hourSum)
    {
        this.hourSum = hourSum;
    }

    public Double getHourSum()
    {
        return hourSum;
    }
    public void setBenefitDouble(Long benefitDouble) 
    {
        this.benefitDouble = benefitDouble;
    }

    public Long getBenefitDouble() 
    {
        return benefitDouble;
    }
    public void setHritemsId(Long hritemsId) 
    {
        this.hritemsId = hritemsId;
    }

    public Long getHritemsId() 
    {
        return hritemsId;
    }
    public void setPayWay(Long payWay) 
    {
        this.payWay = payWay;
    }

    public Long getPayWay() 
    {
        return payWay;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cwExtraWorkitemId", getCwExtraWorkitemId())
            .append("cwExtraWorkId", getCwExtraWorkId())
            .append("toDate", getToDate())
            .append("fromDate", getFromDate())
            .append("daySum", getDaySum())
            .append("hourSum", getHourSum())
            .append("remark", getRemark())
            .append("benefitDouble", getBenefitDouble())
            .append("hritemsId", getHritemsId())
            .append("payWay", getPayWay())
            .toString();
    }
}
