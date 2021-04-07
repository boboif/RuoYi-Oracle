package com.ruoyi.ee.controller;

import java.util.List;

import com.ruoyi.common.utils.ShiroUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.ee.domain.WfPhOught;
import com.ruoyi.ee.service.IWfPhOughtService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 可以享受的假期， 根据规则计算出结果Controller
 * 
 * @author hui
 * @date 2021-04-01
 */
@Controller
@RequestMapping("/ee/remain")
public class WfPhOughtController extends BaseController
{
    private String prefix = "ee/remain";

    @Autowired
    private IWfPhOughtService wfPhOughtService;

    @RequiresPermissions("ee:remain:view")
    @GetMapping()
    public String remain()
    {
        return prefix + "/remain";
    }

    /**
     * 查询可以享受的假期， 根据规则计算出结果列表
     */
    @RequiresPermissions("ee:remain:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WfPhOught wfPhOught)
    {
        wfPhOught.setOnoffStationId(ShiroUtils.getOosId());
        startPage();
        List<WfPhOught> list = wfPhOughtService.selectWfPhOughtList(wfPhOught);
        return getDataTable(list);
    }

    /**
     * 导出可以享受的假期， 根据规则计算出结果列表
     */
    @RequiresPermissions("ee:remain:export")
    @Log(title = "可以享受的假期， 根据规则计算出结果", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WfPhOught wfPhOught)
    {
        wfPhOught.setOnoffStationId(ShiroUtils.getOosId());
        List<WfPhOught> list = wfPhOughtService.selectWfPhOughtList(wfPhOught);
        ExcelUtil<WfPhOught> util = new ExcelUtil<WfPhOught>(WfPhOught.class);
        return util.exportExcel(list, "remain");
    }

    /**
     * 新增可以享受的假期， 根据规则计算出结果
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    @GetMapping("/detail/{phOughtId}")
    public String detail(@PathVariable("phOughtId") Long phOughtId, ModelMap mmap)
    {

        WfPhOught wfPhOught = wfPhOughtService.selectWfPhOughtById(phOughtId);
        mmap.put("wfPhOught", wfPhOught);
        return prefix + "/detail";
    }

    /**
     * 新增保存可以享受的假期， 根据规则计算出结果
     */
    @RequiresPermissions("ee:remain:add")
    @Log(title = "可以享受的假期， 根据规则计算出结果", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WfPhOught wfPhOught)
    {
        return toAjax(wfPhOughtService.insertWfPhOught(wfPhOught));
    }

    /**
     * 修改可以享受的假期， 根据规则计算出结果
     */
    @GetMapping("/edit/{phOughtId}")
    public String edit(@PathVariable("phOughtId") Long phOughtId, ModelMap mmap)
    {
        WfPhOught wfPhOught = wfPhOughtService.selectWfPhOughtById(phOughtId);
        mmap.put("wfPhOught", wfPhOught);
        return prefix + "/edit";
    }

    /**
     * 修改保存可以享受的假期， 根据规则计算出结果
     */
    @RequiresPermissions("ee:remain:edit")
    @Log(title = "可以享受的假期， 根据规则计算出结果", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WfPhOught wfPhOught)
    {
        return toAjax(wfPhOughtService.updateWfPhOught(wfPhOught));
    }

    /**
     * 删除可以享受的假期， 根据规则计算出结果
     */
    @RequiresPermissions("ee:remain:remove")
    @Log(title = "可以享受的假期， 根据规则计算出结果", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(wfPhOughtService.deleteWfPhOughtByIds(ids));
    }
}
