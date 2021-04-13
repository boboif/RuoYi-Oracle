package com.ruoyi.ee.service;

import java.util.List;
import com.ruoyi.ee.domain.CwExtraWork;

/**
 * 加班管理Service接口
 * 
 * @author hui
 * @date 2021-04-09
 */
public interface ICwExtraWorkService 
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
     * 批量删除加班管理
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteCwExtraWorkByIds(String ids);

    /**
     * 删除加班管理信息
     * 
     * @param cwExtraWorkId 加班管理ID
     * @return 结果
     */
    public int deleteCwExtraWorkById(Long cwExtraWorkId);
}
