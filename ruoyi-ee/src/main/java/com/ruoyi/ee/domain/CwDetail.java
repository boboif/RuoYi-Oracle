package com.ruoyi.ee.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 外勤明细对象 cw_detail
 * 
 * @author hui
 * @date 2021-04-09
 */
public class CwDetail extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    
    private Long cwDetailId;

    
    private Long onoffStationId;

    /** 工作日 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "工作日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date workDay;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:MM")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd HH:MM")
    private Date startDate;

    /** 截止时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:MM")
    @Excel(name = "截止时间", width = 30, dateFormat = "yyyy-MM-dd HH:MM")
    private Date endDate;

    /** 时长 */
    @Excel(name = "时长")
    private Double hourSum;

    /** 补偿或扣款 */
    @Excel(name = "补偿或扣款")
    private Long payOrCut;

    /** 如果是有偿加班 按日工资的几倍 */
    @Excel(name = "如果是有偿加班 按日工资的几倍")
    private Long payDouble;

    /** 补扣金额 */
    @Excel(name = "补扣金额")
    private Long cwMoney;

    /** 是否调休 */
    @Excel(name = "是否调休")
    private Long ifMixRest;

    
    @Excel(name = "是否调休")
    private Long hritemsId;

    
    @Excel(name = "是否调休")
    private Long wageMonth;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:MM:SS")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    @Excel(name = "创建时间")
    private Long createId;
    
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modifyDate;

    @Excel(name = "创建时间")
    private Long modifyId;

    @Excel(name = "创建时间")
    private Long dr;

    @Excel(name = "创建时间")
    private Long drId;

    /** 是否显示 */
    @Excel(name = "是否显示")
    private Long ifShow;

    
    @Excel(name = "是否显示")
    private Long errorCode;

    
    @Excel(name = "是否显示")
    private Long psnId;

    
    @Excel(name = "是否显示")
    private String errorDetail;

    /** cw_wsr 的主键 */
    private Long wsrId;

    
    @Excel(name = "是否显示")
    private Long waDataId;

    /** 员工外出报备解释 */
    @Excel(name = "员工外出报备解释")
    private String empOutExplain;

    /** 删除时间 */
    private Date drDate;

    /** 下载时间 */
    private Date downloadTime;

    /** 扣款比例 */
    @Excel(name = "扣款比例")
    private Long cutRatio;

    /** 天数，不可能会大于1 */
    @Excel(name = "天数，不可能会大于1")
    private Long daySum;

    /** 所属年份 */
    @Excel(name = "所属年份")
    private Long belongYear;

    /** 关联 */
    private Long phOughtId;

    public void setCwDetailId(Long cwDetailId) 
    {
        this.cwDetailId = cwDetailId;
    }

    public Long getCwDetailId() 
    {
        return cwDetailId;
    }
    public void setOnoffStationId(Long onoffStationId) 
    {
        this.onoffStationId = onoffStationId;
    }

    public Long getOnoffStationId() 
    {
        return onoffStationId;
    }
    public void setWorkDay(Date workDay) 
    {
        this.workDay = workDay;
    }

    public Date getWorkDay() 
    {
        return workDay;
    }
    public void setStartDate(Date startDate) 
    {
        this.startDate = startDate;
    }

    public Date getStartDate() 
    {
        return startDate;
    }
    public void setEndDate(Date endDate) 
    {
        this.endDate = endDate;
    }

    public Date getEndDate() 
    {
        return endDate;
    }
    public void setHourSum(Double hourSum)
    {
        this.hourSum = hourSum;
    }

    public Double getHourSum()
    {
        return hourSum;
    }
    public void setPayOrCut(Long payOrCut) 
    {
        this.payOrCut = payOrCut;
    }

    public Long getPayOrCut() 
    {
        return payOrCut;
    }
    public void setPayDouble(Long payDouble) 
    {
        this.payDouble = payDouble;
    }

    public Long getPayDouble() 
    {
        return payDouble;
    }
    public void setCwMoney(Long cwMoney) 
    {
        this.cwMoney = cwMoney;
    }

    public Long getCwMoney() 
    {
        return cwMoney;
    }
    public void setIfMixRest(Long ifMixRest) 
    {
        this.ifMixRest = ifMixRest;
    }

    public Long getIfMixRest() 
    {
        return ifMixRest;
    }
    public void setHritemsId(Long hritemsId) 
    {
        this.hritemsId = hritemsId;
    }

    public Long getHritemsId() 
    {
        return hritemsId;
    }
    public void setWageMonth(Long wageMonth) 
    {
        this.wageMonth = wageMonth;
    }

    public Long getWageMonth() 
    {
        return wageMonth;
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
    public void setModifyDate(Date modifyDate) 
    {
        this.modifyDate = modifyDate;
    }

    public Date getModifyDate() 
    {
        return modifyDate;
    }
    public void setModifyId(Long modifyId) 
    {
        this.modifyId = modifyId;
    }

    public Long getModifyId() 
    {
        return modifyId;
    }
    public void setDr(Long dr) 
    {
        this.dr = dr;
    }

    public Long getDr() 
    {
        return dr;
    }
    public void setDrId(Long drId) 
    {
        this.drId = drId;
    }

    public Long getDrId() 
    {
        return drId;
    }
    public void setIfShow(Long ifShow) 
    {
        this.ifShow = ifShow;
    }

    public Long getIfShow() 
    {
        return ifShow;
    }
    public void setErrorCode(Long errorCode) 
    {
        this.errorCode = errorCode;
    }

    public Long getErrorCode() 
    {
        return errorCode;
    }
    public void setPsnId(Long psnId) 
    {
        this.psnId = psnId;
    }

    public Long getPsnId() 
    {
        return psnId;
    }
    public void setErrorDetail(String errorDetail) 
    {
        this.errorDetail = errorDetail;
    }

    public String getErrorDetail() 
    {
        return errorDetail;
    }
    public void setWsrId(Long wsrId) 
    {
        this.wsrId = wsrId;
    }

    public Long getWsrId() 
    {
        return wsrId;
    }
    public void setWaDataId(Long waDataId) 
    {
        this.waDataId = waDataId;
    }

    public Long getWaDataId() 
    {
        return waDataId;
    }
    public void setEmpOutExplain(String empOutExplain) 
    {
        this.empOutExplain = empOutExplain;
    }

    public String getEmpOutExplain() 
    {
        return empOutExplain;
    }
    public void setDrDate(Date drDate) 
    {
        this.drDate = drDate;
    }

    public Date getDrDate() 
    {
        return drDate;
    }
    public void setDownloadTime(Date downloadTime) 
    {
        this.downloadTime = downloadTime;
    }

    public Date getDownloadTime() 
    {
        return downloadTime;
    }
    public void setCutRatio(Long cutRatio) 
    {
        this.cutRatio = cutRatio;
    }

    public Long getCutRatio() 
    {
        return cutRatio;
    }
    public void setDaySum(Long daySum) 
    {
        this.daySum = daySum;
    }

    public Long getDaySum() 
    {
        return daySum;
    }
    public void setBelongYear(Long belongYear) 
    {
        this.belongYear = belongYear;
    }

    public Long getBelongYear() 
    {
        return belongYear;
    }
    public void setPhOughtId(Long phOughtId) 
    {
        this.phOughtId = phOughtId;
    }

    public Long getPhOughtId() 
    {
        return phOughtId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("cwDetailId", getCwDetailId())
            .append("onoffStationId", getOnoffStationId())
            .append("workDay", getWorkDay())
            .append("startDate", getStartDate())
            .append("endDate", getEndDate())
            .append("hourSum", getHourSum())
            .append("payOrCut", getPayOrCut())
            .append("payDouble", getPayDouble())
            .append("cwMoney", getCwMoney())
            .append("ifMixRest", getIfMixRest())
            .append("hritemsId", getHritemsId())
            .append("wageMonth", getWageMonth())
            .append("createDate", getCreateDate())
            .append("createId", getCreateId())
            .append("modifyDate", getModifyDate())
            .append("modifyId", getModifyId())
            .append("dr", getDr())
            .append("drId", getDrId())
            .append("ifShow", getIfShow())
            .append("errorCode", getErrorCode())
            .append("psnId", getPsnId())
            .append("errorDetail", getErrorDetail())
            .append("wsrId", getWsrId())
            .append("waDataId", getWaDataId())
            .append("empOutExplain", getEmpOutExplain())
            .append("drDate", getDrDate())
            .append("downloadTime", getDownloadTime())
            .append("cutRatio", getCutRatio())
            .append("daySum", getDaySum())
            .append("belongYear", getBelongYear())
            .append("phOughtId", getPhOughtId())
            .toString();
    }
}
