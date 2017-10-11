package com.hello.world.memento;

/**
 * @author yangguanbao
 * @date 17/03/2017
 */
public class MementoManager {
    public MementoSay getMementoSay() {
        return mementoSay;
    }

    public void setMementoSay(MementoSay mementoSay) {
        this.mementoSay = mementoSay;
    }

    MementoSay mementoSay;

}
