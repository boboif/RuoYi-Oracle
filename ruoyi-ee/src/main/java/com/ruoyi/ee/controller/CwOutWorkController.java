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
import com.ruoyi.ee.domain.CwOutWork;
import com.ruoyi.ee.service.ICwOutWorkService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 出差Controller
 * 
 * @author hui
 * @date 2021-04-09
 */
@Controller
@RequestMapping("/ee/trip")
public class CwOutWorkController extends BaseController
{
    private String prefix = "ee/trip";

    @Autowired
    private ICwOutWorkService cwOutWorkService;

    @RequiresPermissions("ee:trip:view")
    @GetMapping()
    public String trip()
    {
        return prefix + "/trip";
    }

    /**
     * 查询出差列表
     */
    @RequiresPermissions("ee:trip:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CwOutWork cwOutWork)
    {
        startPage();
        List<CwOutWork> list = cwOutWorkService.selectCwOutWorkList(cwOutWork);
        return getDataTable(list);
    }

    /**
     * 导出出差列表
     */
    @RequiresPermissions("ee:trip:export")
    @Log(title = "出差", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CwOutWork cwOutWork)
    {
        List<CwOutWork> list = cwOutWorkService.selectCwOutWorkList(cwOutWork);
        ExcelUtil<CwOutWork> util = new ExcelUtil<CwOutWork>(CwOutWork.class);
        return util.exportExcel(list, "trip");
    }

    /**
     * 新增出差
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存出差
     */
    @RequiresPermissions("ee:trip:add")
    @Log(title = "出差", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CwOutWork cwOutWork)
    {
        return toAjax(cwOutWorkService.insertCwOutWork(cwOutWork));
    }

    /**
     * 修改出差
     */
    @GetMapping("/edit/{cwOutWorkId}")
    public String edit(@PathVariable("cwOutWorkId") Long cwOutWorkId, ModelMap mmap)
    {
        CwOutWork cwOutWork = cwOutWorkService.selectCwOutWorkById(cwOutWorkId);
        mmap.put("cwOutWork", cwOutWork);
        return prefix + "/edit";
    }

    /**
     * 修改保存出差
     */
    @RequiresPermissions("ee:trip:edit")
    @Log(title = "出差", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CwOutWork cwOutWork)
    {
        return toAjax(cwOutWorkService.updateCwOutWork(cwOutWork));
    }

    /**
     * 删除出差
     */
    @RequiresPermissions("ee:trip:remove")
    @Log(title = "出差", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cwOutWorkService.deleteCwOutWorkByIds(ids));
    }
}
