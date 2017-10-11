package com.hello.world.mediator;

import java.util.Random;

public class Mediator extends AbstractMediator{
    @Override
    public void callPersonSay(String name) {
        AbstractPerson b = colleagues.get(name);
        new Random().nextInt();
    }
}
