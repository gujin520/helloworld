package com.hello.world.strategy;

/**
 * @author yangguanbao
 * @date 16/03/2017
 */
public class Main {
    public static void main(String[] args) {
        Strategy forward = new ForwardStrategy();
        Strategy back = new BackwardStrategy();
        Context context = new Context(forward);
        context.say("hello world");
    }
}
