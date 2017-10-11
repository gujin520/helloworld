package com.hello.world.state;

/**
 * @author yangguanbao
 * @date 15/03/2017
 */
class Main {
    public static void main(String[] args) {
        State hello = new HelloState();
        State world = new WorldState();
        hello.getMessage();
        world.getMessage();
    }
}
