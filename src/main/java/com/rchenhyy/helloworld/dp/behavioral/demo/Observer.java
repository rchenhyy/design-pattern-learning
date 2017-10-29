package com.rchenhyy.helloworld.dp.behavioral.demo;

/**
 * 观察者接口
 *
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/10/29
 */
public interface Observer {

    /**
     * 更新方法, 根据给定目标更新观察者的状态
     *
     * @param subject 目标
     */
    void update(Subject subject);
}
