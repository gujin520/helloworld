package com.hello.world.adapter;

/**
 * @author yangguanbao
 * @date 17/03/2017
 */
class HelloWorld extends SpeakAdapter {
    @Override
    public void SayHelloWorld() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        h.SayHelloWorld();
    }
}
