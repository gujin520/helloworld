package com.hello.world.mediator;

public class AbstractPerson {
    protected AbstractMediator mediator;

    public AbstractPerson(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    // 在抽象同事类中添加用于与中介者取得联系（即注册）的方法
    public void setMediator(AbstractMediator mediator) {
        this.mediator = mediator;
    }

}

