package com.hello.world.mediator;

class PersonSpace extends AbstractPerson {

    //每个具体同事都通过父类构造函数与中介者取得联系
    public PersonSpace(AbstractMediator mediator) {
        super(mediator);
        mediator.addPerson("space", this);
    }

    //每个具体同事必然有自己分内的事，没必要与外界相关联
    public void say() {
        System.out.print(" ");
        System.out.println("adfasdfasdf");
    }

    //每个具体同事总有需要与外界交互的操作，通过中介者来处理这些逻辑并安排工作
    public void demand() {
        super.mediator.callPersonSay("world");
    }
}
