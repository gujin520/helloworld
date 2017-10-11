package com.hello.world.state;

/**
 * @author yangguanbao
 * @date 14/03/2017
 */
public class WorldState implements State{
    @Override
    public void getMessage() {
        System.out.print(" world");
    }

    @Override
    public void getName() {
        System.out.println("My name is WorldState");

    }
}
