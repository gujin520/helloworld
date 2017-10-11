package com.hello.world.chain;

/**
 * @author yangguanbao
 * @date 15/03/2017
 */
public class Main {
    public static void main(String[] args) {
        Handler hello = new HelloHandler();
        Handler intervalHandler = new IntervalHandler();
        Handler worldHandler = new WorldHandler();
        hello.setNextHandler(intervalHandler);
        intervalHandler.setNextHandler(worldHandler);
        hello.doSth();
    }
}
