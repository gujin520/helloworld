package com.hello.world.template.method;

/**
 * @author yangguanbao
 * @date 13/03/2017
 */
abstract class AbstractPerson implements Communicate {
    @Override
    public void say(){}

    public void helloworld(){
        //准备工作，润润嗓子
        System.out.println("");
        say();
        //握着手，交个朋友
        System.out.println("");
    }

    @Override
    public void listen(AbstractPerson p) {}

    @Override
    public void sayTo(AbstractPerson p) {}

}