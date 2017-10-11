package com.hello.world.state;

/**
 * @author yangguanbao
 * @date 14/03/2017
 */
public class HelloState implements State{

    @Override
    public void getMessage() {
        System.out.print("hello");
    }

    @Override
    public void getName() {
        System.out.println("My name is HelloState");

    }
}
