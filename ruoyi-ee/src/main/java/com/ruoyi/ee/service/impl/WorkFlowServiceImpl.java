package com.ruoyi.ee.service.impl;

import com.ruoyi.ee.mapper.WorkflowMapper;
import com.ruoyi.ee.service.WorkFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @Author: hui
 * @Date: 2021/4/19 13:55
 */
@Service
public class WorkFlowServiceImpl implements WorkFlowService {

    @Autowired
    private WorkflowMapper workflowMapper;

    @Override
    public void startProcess(Map map) {
        workflowMapper.startProcess(map);
    }

    @Override
    public void nextProcess(Map map) {
        workflowMapper.nextProcess(map);
    }
}
