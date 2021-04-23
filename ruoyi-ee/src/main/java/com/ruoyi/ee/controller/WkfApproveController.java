package com.ruoyi.ee.controller;

import java.util.List;
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
import com.ruoyi.ee.domain.WkfApproveQuery;
import com.ruoyi.ee.service.IWkfApproveService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 审批Controller
 * 
 * @author hui
 * @date 2021-04-21
 */
@Controller
@RequestMapping("/ee/approve")
public class WkfApproveController extends BaseController
{
    private String prefix = "ee/approve";

    @Autowired
    private IWkfApproveService wkfApproveQueryService;

    @RequiresPermissions("ee:approve:view")
    @GetMapping()
    public String approve()
    {
        return prefix + "/approveList";
    }

    /**
     * 查询审批列表
     */
    @RequiresPermissions("ee:approve:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WkfApproveQuery wkfApproveQuery)
    {
        startPage();
        List<WkfApproveQuery> list = wkfApproveQueryService.selectWkfApproveList(wkfApproveQuery);
        return getDataTable(list);
    }

    /**
     * 导出审批列表
     */
    @RequiresPermissions("ee:approve:export")
    @Log(title = "审批", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WkfApproveQuery wkfApproveQuery)
    {
        List<WkfApproveQuery> list = wkfApproveQueryService.selectWkfApproveList(wkfApproveQuery);
        ExcelUtil<WkfApproveQuery> util = new ExcelUtil<WkfApproveQuery>(WkfApproveQuery.class);
        return util.exportExcel(list, "approve");
    }

    /**
     * 新增审批
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存审批
     */
    @RequiresPermissions("ee:approve:add")
    @Log(title = "审批", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WkfApproveQuery wkfApproveQuery)
    {
        return toAjax(wkfApproveQueryService.insertWkfApprove(wkfApproveQuery));
    }

    /**
     * 审批
     */
    @GetMapping("/approveForm/{processInsId}")
    public String approveForm(@PathVariable("processInsId") Long processInsId, ModelMap mmap)
    {
        WkfApproveQuery wkfApproveQuery = wkfApproveQueryService.selectWkfApproveById(processInsId);
        mmap.put("wkfApproveQuery", wkfApproveQuery);
        return prefix + "/approveForm";
    }

    /**
     * 修改保存审批
     */
    @RequiresPermissions("ee:approve:edit")
    @Log(title = "审批", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WkfApproveQuery wkfApproveQuery)
    {
        return toAjax(wkfApproveQueryService.updateWkfApprove(wkfApproveQuery));
    }

    /**
     * 删除审批
     */
    @RequiresPermissions("ee:approve:remove")
    @Log(title = "审批", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(wkfApproveQueryService.deleteWkfApproveByIds(ids));
    }
}
