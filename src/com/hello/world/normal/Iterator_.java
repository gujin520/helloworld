package com.hello.world.normal;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author yangguanbao
 * @date 14/03/2017
 */
public class Iterator_ {
    public static void main(String[] args) {
        String[] out = {"h", "e", "l", "l", "o", " ", "w", "o", "r", "l", "d"};
        Iterator<String> iterator = Arrays.asList(out).iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }
}
