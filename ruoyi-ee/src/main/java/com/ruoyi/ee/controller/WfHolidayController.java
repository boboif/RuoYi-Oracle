package com.ruoyi.ee.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.ruoyi.common.utils.ShiroUtils;
import com.ruoyi.ee.service.WorkFlowService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.ee.domain.WfHoliday;
import com.ruoyi.ee.service.IWfHolidayService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 假期申请Controller
 *
 * @author hui
 * @date 2021-03-26
 */
@Controller
@RequestMapping("/ee/holiday")
public class WfHolidayController extends BaseController {
    private String prefix = "ee/holiday";

    @Autowired
    private IWfHolidayService wfHolidayService;
    @Autowired
    private WorkFlowService workFlowService;

    @RequiresPermissions("ee:holiday:view")
    @GetMapping()
    public String holiday() {
        return prefix + "/holiday";
    }

    /**
     * 查询假期申请列表
     */
    @RequiresPermissions("ee:holiday:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WfHoliday wfHoliday) {
        startPage();
        List<WfHoliday> list = wfHolidayService.selectWfHolidayList(wfHoliday);
        return getDataTable(list);
    }

    /**
     * 导出假期申请列表
     */
    @RequiresPermissions("ee:holiday:export")
    @Log(title = "假期导出", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WfHoliday wfHoliday) {
        List<WfHoliday> list = wfHolidayService.selectWfHolidayList(wfHoliday);
        ExcelUtil<WfHoliday> util = new ExcelUtil<WfHoliday>(WfHoliday.class);
        return util.exportExcel(list, "holiday");
    }

    /**
     * 新增假期申请
     */
    @GetMapping("/add")
    public String add() {

        return prefix + "/add";
    }

    /**
     * 假期申请
     */
    @RequiresPermissions("ee:holiday:add")
    @Log(title = "假期申请", businessType = BusinessType.INSERT)
    @PostMapping("/apply")
    @ResponseBody
    public AjaxResult apply(WfHoliday wfHoliday) {
        wfHoliday.setStatus(1L);
        AjaxResult ajaxResult =null;
        if (StringUtils.isEmpty(wfHoliday.getWfHolidayId())) {
             wfHolidayService.updateWfHoliday(wfHoliday);
        }else{
            wfHolidayService.insertWfHoliday(wfHoliday);
        }
        Map map = new HashMap<String,String>();
        map.put("applicantOosId", ShiroUtils.getOosId());
        map.put("formTableName","WF_HOLIDAY");
        map.put("formTableCdn","'WF_HOLIDAY_ID="+ wfHoliday.getWfHolidayId()+"'");
        map.put("","");
        workFlowService.startProcess(map);
        return success();
    }

    /**
     * 新增保存假期申请
     */
    @RequiresPermissions("ee:holiday:add")
    @Log(title = "假期保存", businessType = BusinessType.INSERT)
    @PostMapping("/save")
    @ResponseBody
    public AjaxResult save(WfHoliday wfHoliday) {
        wfHoliday.setStatus(0L);
        AjaxResult ajaxResult =null;
        if (StringUtils.isEmpty(wfHoliday.getWfHolidayId())) {
            ajaxResult=toAjax(wfHolidayService.updateWfHoliday(wfHoliday));
        }else{
            ajaxResult =toAjax(wfHolidayService.insertWfHoliday(wfHoliday));
        }
        return ajaxResult;
    }

    /**
     * 修改假期申请
     */
    @GetMapping("/edit/{wfHolidayId}")
    public String edit(@PathVariable("wfHolidayId") Long wfHolidayId, ModelMap mmap) {
        WfHoliday wfHoliday = wfHolidayService.selectWfHolidayById(wfHolidayId);
        mmap.put("wfHoliday", wfHoliday);
        return prefix + "/edit";
    }

    /**
     * 修改保存假期申请
     */
    @RequiresPermissions("ee:holiday:edit")
    @Log(title = "假期申请", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WfHoliday wfHoliday) {
        return toAjax(wfHolidayService.updateWfHoliday(wfHoliday));
    }

    /**
     * 删除假期申请
     */
    @RequiresPermissions("ee:holiday:remove")
    @Log(title = "假期申请", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(wfHolidayService.deleteWfHolidayByIds(ids));
    }
}
