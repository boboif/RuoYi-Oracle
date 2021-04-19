package com.ruoyi.ee.service;

import java.util.Map;

/**
 * @Author: hui
 * @Date: 2021/4/19 13:54
 */
public interface WorkFlowService {
    public void startProcess(Map map);

    public void nextProcess(Map map);
}
