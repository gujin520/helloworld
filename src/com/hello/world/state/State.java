package com.hello.world.state;

/**
 * @author yangguanbao
 * @date 14/03/2017
 */
public interface State {
    /**
     * 获取状态输出信息
     */
    void getMessage();

    /**
     * 获取状态的名称
     */
    void getName();
}
