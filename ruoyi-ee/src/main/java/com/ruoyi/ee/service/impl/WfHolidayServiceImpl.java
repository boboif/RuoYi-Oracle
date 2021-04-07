package com.ruoyi.ee.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import com.ruoyi.common.utils.StringUtils;
import org.springframework.transaction.annotation.Transactional;
import com.ruoyi.ee.domain.WfHolidayItem;
import com.ruoyi.ee.mapper.WfHolidayMapper;
import com.ruoyi.ee.domain.WfHoliday;
import com.ruoyi.ee.service.IWfHolidayService;
import com.ruoyi.common.core.text.Convert;

/**
 * 假期申请Service业务层处理
 * 
 * @author hui
 * @date 2021-03-26
 */
@Service
public class WfHolidayServiceImpl implements IWfHolidayService 
{
    @Autowired
    private WfHolidayMapper wfHolidayMapper;

    /**
     * 查询假期申请
     * 
     * @param wfHolidayId 假期申请ID
     * @return 假期申请
     */
    @Override
    public WfHoliday selectWfHolidayById(Long wfHolidayId)
    {
        return wfHolidayMapper.selectWfHolidayById(wfHolidayId);
    }

    /**
     * 查询假期申请列表
     * 
     * @param wfHoliday 假期申请
     * @return 假期申请
     */
    @Override
    public List<WfHoliday> selectWfHolidayList(WfHoliday wfHoliday)
    {
        return wfHolidayMapper.selectWfHolidayList(wfHoliday);
    }

    /**
     * 新增假期申请
     * 
     * @param wfHoliday 假期申请
     * @return 结果
     */
    @Transactional
    @Override
    public int insertWfHoliday(WfHoliday wfHoliday)
    {
        wfHoliday.setCreateTime(DateUtils.getNowDate());
        int rows = wfHolidayMapper.insertWfHoliday(wfHoliday);
        insertWfHolidayItem(wfHoliday);
        return rows;
    }

    /**
     * 修改假期申请
     * 
     * @param wfHoliday 假期申请
     * @return 结果
     */
    @Transactional
    @Override
    public int updateWfHoliday(WfHoliday wfHoliday)
    {
        wfHoliday.setUpdateTime(DateUtils.getNowDate());
        wfHolidayMapper.deleteWfHolidayItemByWfHolidayId(wfHoliday.getWfHolidayId());
        insertWfHolidayItem(wfHoliday);
        return wfHolidayMapper.updateWfHoliday(wfHoliday);
    }

    /**
     * 删除假期申请对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Transactional
    @Override
    public int deleteWfHolidayByIds(String ids)
    {
        wfHolidayMapper.deleteWfHolidayItemByWfHolidayIds(Convert.toStrArray(ids));
        return wfHolidayMapper.deleteWfHolidayByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除假期申请信息
     * 
     * @param wfHolidayId 假期申请ID
     * @return 结果
     */
    @Override
    public int deleteWfHolidayById(Long wfHolidayId)
    {
        wfHolidayMapper.deleteWfHolidayItemByWfHolidayId(wfHolidayId);
        return wfHolidayMapper.deleteWfHolidayById(wfHolidayId);
    }

    /**
     * 新增请假明细信息
     * 
     * @param wfHoliday 假期申请对象
     */
    public void insertWfHolidayItem(WfHoliday wfHoliday)
    {
        List<WfHolidayItem> wfHolidayItemList = wfHoliday.getWfHolidayItemList();
        Long wfHolidayId = wfHoliday.getWfHolidayId();
        if (StringUtils.isNotNull(wfHolidayItemList))
        {
            List<WfHolidayItem> list = new ArrayList<WfHolidayItem>();
            for (WfHolidayItem wfHolidayItem : wfHolidayItemList)
            {
                wfHolidayItem.setWfHolidayId(wfHolidayId);
                list.add(wfHolidayItem);
            }
            if (list.size() > 0)
            {
                wfHolidayMapper.batchWfHolidayItem(list);
            }
        }
    }
}
