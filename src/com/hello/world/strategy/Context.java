package com.hello.world.strategy;

/**
 * @author yangguanbao
 * @date 16/03/2017
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void say(String input){
        strategy.say(input);
    }
}
