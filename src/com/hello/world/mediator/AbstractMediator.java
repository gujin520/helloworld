package com.hello.world.mediator;

import java.util.HashMap;

public abstract class AbstractMediator {
    //中介者肯定需要保持有若干同事的联系方式
    protected HashMap<String, AbstractPerson> colleagues = new HashMap<String, AbstractPerson>();

    //中介者可以动态地与某个同事建立联系
    public void addPerson(String name, AbstractPerson c) {
        this.colleagues.put(name, c);
    }

    //中介者必须具备在同事之间处理逻辑、分配任务、促进交流的操作
    public abstract void callPersonSay(String name);
}
