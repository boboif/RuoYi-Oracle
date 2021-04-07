package com.ruoyi.ee.service;

import java.util.List;
import com.ruoyi.ee.domain.WfPhOught;

/**
 * 可以享受的假期， 根据规则计算出结果Service接口
 * 
 * @author hui
 * @date 2021-04-01
 */
public interface IWfPhOughtService 
{
    /**
     * 查询可以享受的假期， 根据规则计算出结果
     * 
     * @param phOughtId 可以享受的假期， 根据规则计算出结果ID
     * @return 可以享受的假期， 根据规则计算出结果
     */
    public WfPhOught selectWfPhOughtById(Long phOughtId);

    /**
     * 查询可以享受的假期， 根据规则计算出结果列表
     * 
     * @param wfPhOught 可以享受的假期， 根据规则计算出结果
     * @return 可以享受的假期， 根据规则计算出结果集合
     */
    public List<WfPhOught> selectWfPhOughtList(WfPhOught wfPhOught);

    /**
     * 新增可以享受的假期， 根据规则计算出结果
     * 
     * @param wfPhOught 可以享受的假期， 根据规则计算出结果
     * @return 结果
     */
    public int insertWfPhOught(WfPhOught wfPhOught);

    /**
     * 修改可以享受的假期， 根据规则计算出结果
     * 
     * @param wfPhOught 可以享受的假期， 根据规则计算出结果
     * @return 结果
     */
    public int updateWfPhOught(WfPhOught wfPhOught);

    /**
     * 批量删除可以享受的假期， 根据规则计算出结果
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteWfPhOughtByIds(String ids);

    /**
     * 删除可以享受的假期， 根据规则计算出结果信息
     * 
     * @param phOughtId 可以享受的假期， 根据规则计算出结果ID
     * @return 结果
     */
    public int deleteWfPhOughtById(Long phOughtId);
}
