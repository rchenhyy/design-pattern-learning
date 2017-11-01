package com.rchenhyy.helloworld.dp.behavioral.observer;

/**
 * 目标接口
 *
 * @author chenjiahua.chen
 * @version v1.0.0
 * @since 17/10/29
 */
public interface Subject {

    /**
     * 为当前目标添加一个观察者
     *
     * @param observer 观察者
     */
    void attach(Observer observer);

    /**
     * 从当前目标删除一个观察者
     *
     * @param observer 观察者
     */
    void detach(Observer observer);

    /**
     * 通知方法, 当当前目标发生状态变化时触发 (更精确地说, 当当前目标发生任何可能导致其观察者与其本身状态不一致的改变时触发)
     */
    // 因为Object.notify()方法的存在, 方法名避开了notify
    void onChange();
}
