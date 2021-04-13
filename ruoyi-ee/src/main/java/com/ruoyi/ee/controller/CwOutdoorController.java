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
import com.ruoyi.ee.domain.CwDetail;
import com.ruoyi.ee.service.IOutdoorService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 外勤明细Controller
 * 
 * @author hui
 * @date 2021-04-09
 */
@Controller
@RequestMapping("/ee/outdoor")
public class CwOutdoorController extends BaseController
{
    private String prefix = "ee/outdoor";

    @Autowired
    private IOutdoorService cwDetailService;

    @RequiresPermissions("ee:outdoor:view")
    @GetMapping()
    public String outdoor()
    {
        return prefix + "/outdoor";
    }

    /**
     * 查询外勤明细列表
     */
    @RequiresPermissions("ee:outdoor:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CwDetail cwDetail)
    {
        startPage();
        List<CwDetail> list = cwDetailService.selectCwDetailList(cwDetail);
        return getDataTable(list);
    }

    /**
     * 导出外勤明细列表
     */
    @RequiresPermissions("ee:outdoor:export")
    @Log(title = "外勤明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CwDetail cwDetail)
    {
        List<CwDetail> list = cwDetailService.selectCwDetailList(cwDetail);
        ExcelUtil<CwDetail> util = new ExcelUtil<CwDetail>(CwDetail.class);
        return util.exportExcel(list, "outdoor");
    }

    /**
     * 新增外勤明细
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存外勤明细
     */
    @RequiresPermissions("ee:outdoor:add")
    @Log(title = "外勤明细", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CwDetail cwDetail)
    {
        return toAjax(cwDetailService.insertCwDetail(cwDetail));
    }

    /**
     * 修改外勤明细
     */
    @GetMapping("/edit/{cwDetailId}")
    public String edit(@PathVariable("cwDetailId") Long cwDetailId, ModelMap mmap)
    {
        CwDetail cwDetail = cwDetailService.selectCwDetailById(cwDetailId);
        mmap.put("cwDetail", cwDetail);
        return prefix + "/edit";
    }

    /**
     * 修改保存外勤明细
     */
    @RequiresPermissions("ee:outdoor:edit")
    @Log(title = "外勤明细", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CwDetail cwDetail)
    {
        return toAjax(cwDetailService.updateCwDetail(cwDetail));
    }

    /**
     * 删除外勤明细
     */
    @RequiresPermissions("ee:outdoor:remove")
    @Log(title = "外勤明细", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cwDetailService.deleteCwDetailByIds(ids));
    }
}
