package com.ruoyi.ee.domain;

import java.util.List;

import com.ruoyi.common.utils.ShiroUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 假期申请对象 wf_holiday
 *
 * @author hui
 * @date 2021-03-26
 */
public class WfHoliday extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long wfHolidayId;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long onoffStationId;

    /**
     * 类型
     */
    @Excel(name = "类型")
    private Integer hritemsId;

    /**
     * 总天数
     */
    @Excel(name = "总天数")
    private Long allDays;

    /**
     * 总时数
     */
    @Excel(name = "总时数")
    private Long allHours;

    /**
     * 状态0未申请1申请中 2 通过 3驳回
     */
    @Excel(name = "状态0未申请1申请中 2 通过 3驳回")
    private Long status;

    /**
     * 创建人ID
     */
    @Excel(name = "创建人ID")
    private Long createId;

    /**
     * 审批历史
     */
    @Excel(name = "审批历史")
    private String verifyDesc;

    /**
     * 说明
     */
    @Excel(name = "说明")
    private String talk;

    /**
     * 是否显示
     */
    @Excel(name = "是否显示")
    private Long ifCwDetailShow;

    /**
     * 流程ID
     */
    @Excel(name = "流程ID")
    private Long processInsId;

    /**
     * 请假明细信息
     */
    private List<WfHolidayItem> wfHolidayItemList;

    public void setWfHolidayId(Long wfHolidayId) {
        this.wfHolidayId = wfHolidayId;
    }

    public Long getWfHolidayId() {
        return wfHolidayId;
    }

    public void setOnoffStationId(Long onoffStationId) {
        this.onoffStationId = onoffStationId;
    }

    public Long getOnoffStationId() {
        return onoffStationId;
    }

    public void setHritemsId(Integer hritemsId) {
        this.hritemsId = hritemsId;
    }

    public Integer getHritemsId() {
        return hritemsId;
    }

    public void setAllDays(Long allDays) {
        this.allDays = allDays;
    }

    public Long getAllDays() {
        return allDays;
    }

    public void setAllHours(Long allHours) {
        this.allHours = allHours;
    }

    public Long getAllHours() {
        return allHours;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return status;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setVerifyDesc(String verifyDesc) {
        this.verifyDesc = verifyDesc;
    }

    public String getVerifyDesc() {
        return verifyDesc;
    }

    public void setTalk(String talk) {
        this.talk = talk;
    }

    public String getTalk() {
        return talk;
    }

    public void setIfCwDetailShow(Long ifCwDetailShow) {
        this.ifCwDetailShow = ifCwDetailShow;
    }

    public Long getIfCwDetailShow() {
        return ifCwDetailShow;
    }

    public void setProcessInsId(Long processInsId) {
        this.processInsId = processInsId;
    }

    public Long getProcessInsId() {
        return processInsId;
    }

    public List<WfHolidayItem> getWfHolidayItemList() {
        return wfHolidayItemList;
    }

    public void setWfHolidayItemList(List<WfHolidayItem> wfHolidayItemList) {
        this.wfHolidayItemList = wfHolidayItemList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("wfHolidayId", getWfHolidayId())
                .append("onoffStationId", getOnoffStationId())
                .append("hritemsId", getHritemsId())
                .append("allDays", getAllDays())
                .append("allHours", getAllHours())
                .append("status", getStatus())
                .append("createTime", getCreateTime())
                .append("createId", getCreateId())
                .append("verifyDesc", getVerifyDesc())
                .append("talk", getTalk())
                .append("ifCwDetailShow", getIfCwDetailShow())
                .append("processInsId", getProcessInsId())
                .append("createBy", getCreateBy())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .append("wfHolidayItemList", getWfHolidayItemList())
                .toString();
    }
}
