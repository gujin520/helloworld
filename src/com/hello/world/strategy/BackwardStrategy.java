package com.hello.world.strategy;

/**
 * @author yangguanbao
 * @date 15/03/2017
 */
public class BackwardStrategy implements Strategy{
    @Override
    public void say(String input) {
        StringBuilder sb = new StringBuilder(input);
        String b =  sb.reverse().toString();
        System.out.println(sb.reverse().toString());

    }
}
