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
import com.ruoyi.ee.domain.CwExtraWork;
import com.ruoyi.ee.service.ICwExtraWorkService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 加班管理Controller
 * 
 * @author hui
 * @date 2021-04-09
 */
@Controller
@RequestMapping("/ee/ot")
public class CwExtraWorkController extends BaseController
{
    private String prefix = "ee/ot";

    @Autowired
    private ICwExtraWorkService cwExtraWorkService;

    @RequiresPermissions("ee:ot:view")
    @GetMapping()
    public String ot()
    {
        return prefix + "/ot";
    }

    /**
     * 查询加班管理列表
     */
    @RequiresPermissions("ee:ot:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CwExtraWork cwExtraWork)
    {
        startPage();
        List<CwExtraWork> list = cwExtraWorkService.selectCwExtraWorkList(cwExtraWork);
        return getDataTable(list);
    }

    /**
     * 导出加班管理列表
     */
    @RequiresPermissions("ee:ot:export")
    @Log(title = "加班管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CwExtraWork cwExtraWork)
    {
        List<CwExtraWork> list = cwExtraWorkService.selectCwExtraWorkList(cwExtraWork);
        ExcelUtil<CwExtraWork> util = new ExcelUtil<CwExtraWork>(CwExtraWork.class);
        return util.exportExcel(list, "ot");
    }

    /**
     * 新增加班管理
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存加班管理
     */
    @RequiresPermissions("ee:ot:add")
    @Log(title = "加班管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CwExtraWork cwExtraWork)
    {
        return toAjax(cwExtraWorkService.insertCwExtraWork(cwExtraWork));
    }

    /**
     * 修改加班管理
     */
    @GetMapping("/edit/{cwExtraWorkId}")
    public String edit(@PathVariable("cwExtraWorkId") Long cwExtraWorkId, ModelMap mmap)
    {
        CwExtraWork cwExtraWork = cwExtraWorkService.selectCwExtraWorkById(cwExtraWorkId);
        mmap.put("cwExtraWork", cwExtraWork);
        return prefix + "/edit";
    }

    /**
     * 修改保存加班管理
     */
    @RequiresPermissions("ee:ot:edit")
    @Log(title = "加班管理", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CwExtraWork cwExtraWork)
    {
        return toAjax(cwExtraWorkService.updateCwExtraWork(cwExtraWork));
    }

    /**
     * 删除加班管理
     */
    @RequiresPermissions("ee:ot:remove")
    @Log(title = "加班管理", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(cwExtraWorkService.deleteCwExtraWorkByIds(ids));
    }
}
