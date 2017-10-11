package com.hello.world.chain;

/**
 * @author yangguanbao
 * @date 15/03/2017
 */
public class IntervalHandler extends Handler {
    @Override
    public void doSth() {
        System.out.print(" ");
        doNext();
    }
}
