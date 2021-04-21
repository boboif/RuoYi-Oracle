package com.ruoyi.ee.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 审批对象 wkf_process_ins
 * 
 * @author hui
 * @date 2021-04-21
 */
public class WkfApproveQuery extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long processInsId;

    /** 流程定义ID */
    @Excel(name = "流程定义ID")
    private Long processDefId;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 截止时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 发起人 */
    @Excel(name = "发起人")
    private Long starter;

    /** 状态 */
    @Excel(name = "状态")
    private Long status;

    public void setProcessInsId(Long processInsId) 
    {
        this.processInsId = processInsId;
    }

    public Long getProcessInsId() 
    {
        return processInsId;
    }
    public void setProcessDefId(Long processDefId) 
    {
        this.processDefId = processDefId;
    }

    public Long getProcessDefId() 
    {
        return processDefId;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setStarter(Long starter) 
    {
        this.starter = starter;
    }

    public Long getStarter() 
    {
        return starter;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("processInsId", getProcessInsId())
            .append("processDefId", getProcessDefId())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("starter", getStarter())
            .append("status", getStatus())
            .toString();
    }
}
