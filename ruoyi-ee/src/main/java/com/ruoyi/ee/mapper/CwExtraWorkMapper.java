package com.ruoyi.ee.mapper;

import java.util.List;
import com.ruoyi.ee.domain.CwExtraWork;
import com.ruoyi.ee.domain.CwExtraWorkitem;

/**
 * 加班管理Mapper接口
 * 
 * @author hui
 * @date 2021-04-09
 */
public interface CwExtraWorkMapper 
{
    /**
     * 查询加班管理
     * 
     * @param cwExtraWorkId 加班管理ID
     * @return 加班管理
     */
    public CwExtraWork selectCwExtraWorkById(Long cwExtraWorkId);

    /**
     * 查询加班管理列表
     * 
     * @param cwExtraWork 加班管理
     * @return 加班管理集合
     */
    public List<CwExtraWork> selectCwExtraWorkList(CwExtraWork cwExtraWork);

    /**
     * 新增加班管理
     * 
     * @param cwExtraWork 加班管理
     * @return 结果
     */
    public int insertCwExtraWork(CwExtraWork cwExtraWork);

    /**
     * 修改加班管理
     * 
     * @param cwExtraWork 加班管理
     * @return 结果
     */
    public int updateCwExtraWork(CwExtraWork cwExtraWork);

    /**
     * 删除加班管理
     * 
     * @param cwExtraWorkId 加班管理ID
     * @return 结果
     */
    public int deleteCwExtraWorkById(Long cwExtraWorkId);

    /**
     * 批量删除加班管理
     * 
     * @param cwExtraWorkIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCwExtraWorkByIds(String[] cwExtraWorkIds);

    /**
     * 批量删除考勤 加班管理
     * 
     * @param customerIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteCwExtraWorkitemByCwExtraWorkIds(String[] cwExtraWorkIds);
    
    /**
     * 批量新增考勤 加班管理
     * 
     * @param cwExtraWorkitemList 考勤 加班管理列表
     * @return 结果
     */
    public int batchCwExtraWorkitem(List<CwExtraWorkitem> cwExtraWorkitemList);
    

    /**
     * 通过加班管理ID删除考勤 加班管理信息
     * 
     * @param
     * @return 结果
     */
    public int deleteCwExtraWorkitemByCwExtraWorkId(Long cwExtraWorkId);
}
