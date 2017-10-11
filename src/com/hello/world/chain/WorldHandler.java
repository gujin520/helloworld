package com.hello.world.chain;

/**
 * @author yangguanbao
 * @date 15/03/2017
 */
public class WorldHandler extends Handler {
    @Override
    public void doSth() {
        System.out.print("world");
        doNext();
    }
}
