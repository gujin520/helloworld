package com.hello.world.strategy;

/**
 * @author yangguanbao
 * @date 15/03/2017
 */
public class ForwardStrategy implements Strategy{
    @Override
    public void say(String input) {
        System.out.println(input);
    }
}
