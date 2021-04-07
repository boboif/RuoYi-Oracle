package com.ruoyi.ee.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ee.mapper.WfPhOughtMapper;
import com.ruoyi.ee.domain.WfPhOught;
import com.ruoyi.ee.service.IWfPhOughtService;
import com.ruoyi.common.core.text.Convert;

/**
 * 可以享受的假期， 根据规则计算出结果Service业务层处理
 * 
 * @author hui
 * @date 2021-04-01
 */
@Service
public class WfPhOughtServiceImpl implements IWfPhOughtService 
{
    @Autowired
    private WfPhOughtMapper wfPhOughtMapper;

    /**
     * 查询可以享受的假期， 根据规则计算出结果
     * 
     * @param phOughtId 可以享受的假期， 根据规则计算出结果ID
     * @return 可以享受的假期， 根据规则计算出结果
     */
    @Override
    public WfPhOught selectWfPhOughtById(Long phOughtId)
    {
        WfPhOught wfPhOught = new WfPhOught();
        return wfPhOughtMapper.selectWfPhOughtById(wfPhOught);
    }

    /**
     * 查询可以享受的假期， 根据规则计算出结果列表
     * 
     * @param wfPhOught 可以享受的假期， 根据规则计算出结果
     * @return 可以享受的假期， 根据规则计算出结果
     */
    @Override
    public List<WfPhOught> selectWfPhOughtList(WfPhOught wfPhOught)
    {
        return wfPhOughtMapper.selectWfPhOughtList(wfPhOught);
    }

    /**
     * 新增可以享受的假期， 根据规则计算出结果
     * 
     * @param wfPhOught 可以享受的假期， 根据规则计算出结果
     * @return 结果
     */
    @Override
    public int insertWfPhOught(WfPhOught wfPhOught)
    {
        return wfPhOughtMapper.insertWfPhOught(wfPhOught);
    }

    /**
     * 修改可以享受的假期， 根据规则计算出结果
     * 
     * @param wfPhOught 可以享受的假期， 根据规则计算出结果
     * @return 结果
     */
    @Override
    public int updateWfPhOught(WfPhOught wfPhOught)
    {
        return wfPhOughtMapper.updateWfPhOught(wfPhOught);
    }

    /**
     * 删除可以享受的假期， 根据规则计算出结果对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteWfPhOughtByIds(String ids)
    {
        return wfPhOughtMapper.deleteWfPhOughtByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除可以享受的假期， 根据规则计算出结果信息
     * 
     * @param phOughtId 可以享受的假期， 根据规则计算出结果ID
     * @return 结果
     */
    @Override
    public int deleteWfPhOughtById(Long phOughtId)
    {
        return wfPhOughtMapper.deleteWfPhOughtById(phOughtId);
    }
}
