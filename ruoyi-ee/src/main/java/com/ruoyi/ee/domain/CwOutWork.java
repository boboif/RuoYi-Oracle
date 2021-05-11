package com.ruoyi.ee.domain;

import java.math.BigDecimal;
import java.util.List;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 出差对象 cw_out_work
 * 
 * @author hui
 * @date 2021-04-09
 */
public class CwOutWork extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long cwOutWorkId;

    /** $column.columnComment */
    private Long onoffStationId;

    /** 总天数 */
    @Excel(name = "总天数")
    private Double allDays;

    /** 总时数 */
    @Excel(name = "总时数")
    private Double allHours;

    /** 申请状态 */
    @Excel(name = "申请状态")
    private Long status;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** $column.columnComment */
    private Long createId;

    /** 审核历史 */
    @Excel(name = "审核历史")
    private String verifyDesc;

    /** 说明 */
    @Excel(name = "说明")
    private String talk;

    /** 预支金额 */
    @Excel(name = "预支金额")
    private Long advanceMoney;

    /** $column.columnComment */
    private Long ifCwDetailShow;

    /** $column.columnComment */
    private Long processInsId;

    /** $table.subTable.functionName信息 */
    private List<CwOutWorkitem> cwOutWorkitemList;

    public void setCwOutWorkId(Long cwOutWorkId) 
    {
        this.cwOutWorkId = cwOutWorkId;
    }

    public Long getCwOutWorkId() 
    {
        return cwOutWorkId;
    }
    public void setOnoffStationId(Long onoffStationId) 
    {
        this.onoffStationId = onoffStationId;
    }

    public Long getOnoffStationId() 
    {
        return onoffStationId;
    }
    public void setAllDays(Double allDays)
    {
        this.allDays = allDays;
    }

    public Double getAllDays()
    {
        return allDays;
    }
    public void setAllHours(Double allHours)
    {
        this.allHours = allHours;
    }

    public Double getAllHours()
    {
        return allHours;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }
    public void setCreateId(Long createId) 
    {
        this.createId = createId;
    }

    public Long getCreateId() 
    {
        return createId;
    }
    public void setVerifyDesc(String verifyDesc) 
    {
        this.verifyDesc = verifyDesc;
    }

    public String getVerifyDesc() 
    {
        return verifyDesc;
    }
    public void setTalk(String talk) 
    {
        this.talk = talk;
    }

    public String getTalk() 
    {
        return talk;
    }
    public void setAdvanceMoney(Long advanceMoney) 
    {
        this.advanceMoney = advanceMoney;
    }

    public Long getAdvanceMoney() 
    {
        return advanceMoney;
    }
    public void setIfCwDetailShow(Long ifCwDetailShow) 
    {
        this.ifCwDetailShow = ifCwDetailShow;
    }

    public Long getIfCwDetailShow() 
    {
        return ifCwDetailShow;
    }
    public void setProcessInsId(Long processInsId) 
    {
        this.processInsId = processInsId;
    }

    public Long getProcessInsId() 
    {
        return processInsId;
    }

    public List<CwOutWorkitem> getCwOutWorkitemList()
    {
        return cwOutWorkitemList;
    }

    public void setCwOutWorkitemList(List<CwOutWorkitem> cwOutWorkitemList)
    {
        this.cwOutWorkitemList = cwOutWorkitemList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cwOutWorkId", getCwOutWorkId())
            .append("onoffStationId", getOnoffStationId())
            .append("allDays", getAllDays())
            .append("allHours", getAllHours())
            .append("status", getStatus())
            .append("createDate", getCreateDate())
            .append("createId", getCreateId())
            .append("verifyDesc", getVerifyDesc())
            .append("talk", getTalk())
            .append("advanceMoney", getAdvanceMoney())
            .append("ifCwDetailShow", getIfCwDetailShow())
            .append("processInsId", getProcessInsId())
            .append("cwOutWorkitemList", getCwOutWorkitemList())
            .toString();
    }
}
