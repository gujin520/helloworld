package com.hello.world.proxy;

/**
 * @author yangguanbao
 * @date 17/03/2017
 */
public class HelloWorldSubject implements Subject {
        @Override
        public void say() {
            System.out.println("hello world");
        }
}
