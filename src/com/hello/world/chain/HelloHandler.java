package com.hello.world.chain;

/**
 * @author yangguanbao
 * @date 15/03/2017
 */
public class HelloHandler extends Handler{
    @Override
    public void doSth(){
        System.out.print("hello");
        doNext();
    }
}
