package com.hello.world.proxy;

/**
 * @author yangguanbao
 * @date 17/03/2017
 */
public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void say() {
        subject.say();
    }

    public static void main(String[] args) {
        Subject s = new HelloWorldSubject();
        Proxy p = new Proxy(s);
        p.say();
    }
}
