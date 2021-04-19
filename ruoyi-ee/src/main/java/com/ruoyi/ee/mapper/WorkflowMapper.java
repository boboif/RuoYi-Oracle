package com.ruoyi.ee.mapper;

import java.util.Map;

/**
 * @Author: hui
 * @Date: 2021/4/13 19:48
 */
public interface WorkflowMapper {


      void startProcess(Map map);
      void nextProcess(Map map);



      // 以下流程方法可作废
      void apply(Map map);
      void approve(Map map);
      void reject(Map map);


}
