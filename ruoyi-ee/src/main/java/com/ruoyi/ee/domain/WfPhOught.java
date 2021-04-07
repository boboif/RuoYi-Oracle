package com.ruoyi.ee.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 可以享受的假期， 根据规则计算出结果对象 wf_ph_ought
 * 
 * @author hui
 * @date 2021-04-01
 */
public class WfPhOught extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long phOughtId;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long onoffStationId;

    /** 剩余小时数 = curentHours + lastYearPHHours - usedHours */
    @Excel(name = "剩余小时数 = curentHours + lastYearPHHours - usedHours")
    private Long phHours;

    /** 剩余天数 */
    @Excel(name = "剩余天数")
    private Long phDays;

    /** 假期类型 */
    @Excel(name = "假期类型")
    private Long hritemsId;

    /** 最近计算时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最近计算时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastComputeTime;

    /** 上年转入天数 */
    @Excel(name = "上年转入天数")
    private Long lastYearRollinDays;

    /** 上年转入时数 */
    @Excel(name = "上年转入时数")
    private Long lastYearRollinHours;

    /** 已用天数 */
    @Excel(name = "已用天数")
    private Long usedDays;

    /** 已用时数 */
    @Excel(name = "已用时数")
    private Long usedHours;

    /** 属于哪个年份 */
    @Excel(name = "属于哪个年份")
    private Long belongYear;

    /** 本年天数（实时更新） */
    @Excel(name = "本年天数", readConverterExp = "实=时更新")
    private Long curentDays;

    /** 本年时数（实时更新） */
    @Excel(name = "本年时数", readConverterExp = "实=时更新")
    private Long curentHours;

    /** 手动输入的本年天数 */
    @Excel(name = "手动输入的本年天数")
    private Long inputCurentDays;

    /** $column.columnComment */
    @Excel(name = "手动输入的本年天数")
    private Long createId;

    /** $column.columnComment */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "手动输入的本年天数", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    /** $column.columnComment */
    @Excel(name = "手动输入的本年天数")
    private Long modifyId;

    /** $column.columnComment */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "手动输入的本年天数", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modifyDate;

    public void setPhOughtId(Long phOughtId) 
    {
        this.phOughtId = phOughtId;
    }

    public Long getPhOughtId() 
    {
        return phOughtId;
    }
    public void setOnoffStationId(Long onoffStationId) 
    {
        this.onoffStationId = onoffStationId;
    }

    public Long getOnoffStationId() 
    {
        return onoffStationId;
    }
    public void setPhHours(Long phHours) 
    {
        this.phHours = phHours;
    }

    public Long getPhHours() 
    {
        return phHours;
    }
    public void setPhDays(Long phDays) 
    {
        this.phDays = phDays;
    }

    public Long getPhDays() 
    {
        return phDays;
    }
    public void setHritemsId(Long hritemsId) 
    {
        this.hritemsId = hritemsId;
    }

    public Long getHritemsId() 
    {
        return hritemsId;
    }
    public void setLastComputeTime(Date lastComputeTime) 
    {
        this.lastComputeTime = lastComputeTime;
    }

    public Date getLastComputeTime() 
    {
        return lastComputeTime;
    }
    public void setLastYearRollinDays(Long lastYearRollinDays) 
    {
        this.lastYearRollinDays = lastYearRollinDays;
    }

    public Long getLastYearRollinDays() 
    {
        return lastYearRollinDays;
    }
    public void setLastYearRollinHours(Long lastYearRollinHours) 
    {
        this.lastYearRollinHours = lastYearRollinHours;
    }

    public Long getLastYearRollinHours() 
    {
        return lastYearRollinHours;
    }
    public void setUsedDays(Long usedDays) 
    {
        this.usedDays = usedDays;
    }

    public Long getUsedDays() 
    {
        return usedDays;
    }
    public void setUsedHours(Long usedHours) 
    {
        this.usedHours = usedHours;
    }

    public Long getUsedHours() 
    {
        return usedHours;
    }
    public void setBelongYear(Long belongYear) 
    {
        this.belongYear = belongYear;
    }

    public Long getBelongYear() 
    {
        return belongYear;
    }
    public void setCurentDays(Long curentDays) 
    {
        this.curentDays = curentDays;
    }

    public Long getCurentDays() 
    {
        return curentDays;
    }
    public void setCurentHours(Long curentHours) 
    {
        this.curentHours = curentHours;
    }

    public Long getCurentHours() 
    {
        return curentHours;
    }
    public void setInputCurentDays(Long inputCurentDays) 
    {
        this.inputCurentDays = inputCurentDays;
    }

    public Long getInputCurentDays() 
    {
        return inputCurentDays;
    }
    public void setCreateId(Long createId) 
    {
        this.createId = createId;
    }

    public Long getCreateId() 
    {
        return createId;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }
    public void setModifyId(Long modifyId) 
    {
        this.modifyId = modifyId;
    }

    public Long getModifyId() 
    {
        return modifyId;
    }
    public void setModifyDate(Date modifyDate) 
    {
        this.modifyDate = modifyDate;
    }

    public Date getModifyDate() 
    {
        return modifyDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("phOughtId", getPhOughtId())
            .append("onoffStationId", getOnoffStationId())
            .append("phHours", getPhHours())
            .append("phDays", getPhDays())
            .append("hritemsId", getHritemsId())
            .append("lastComputeTime", getLastComputeTime())
            .append("remark", getRemark())
            .append("lastYearRollinDays", getLastYearRollinDays())
            .append("lastYearRollinHours", getLastYearRollinHours())
            .append("usedDays", getUsedDays())
            .append("usedHours", getUsedHours())
            .append("belongYear", getBelongYear())
            .append("curentDays", getCurentDays())
            .append("curentHours", getCurentHours())
            .append("inputCurentDays", getInputCurentDays())
            .append("createId", getCreateId())
            .append("createDate", getCreateDate())
            .append("modifyId", getModifyId())
            .append("modifyDate", getModifyDate())
            .toString();
    }
}
