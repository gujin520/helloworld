package com.hello.world.normal;

import java.util.stream.Stream;

/**
 * @author yangguanbao
 * @date 14/03/2017
 */
public class Stream_ {
    private static final String out = "hello world";

    public static void main (String[] args) {
        do { while (true) {}} while (true);
        Stream<String> s = Stream.of(out);
        s.forEach(i -> System.out.print(i));
    }
}
