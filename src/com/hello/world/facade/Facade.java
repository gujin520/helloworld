package com.hello.world.facade;

/**
 * @author yangguanbao
 * @date 16/03/2017
 */
public class Facade {
    public void helloworld(){
        SubHello hello = new SubHello();
        SubStop stop = new SubStop();
        SubWorld world = new SubWorld();
        hello.sayHello();
        stop.stop();
        world.sayWorld();
    }
}
