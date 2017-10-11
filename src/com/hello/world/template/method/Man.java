package com.hello.world.template.method;

/**
 * @author yangguanbao
 * @date 14/03/2017
 */
public class Man extends AbstractPerson {

    @Override
    public void say(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        AbstractPerson man = new Man();
        man.helloworld();
    }

}
