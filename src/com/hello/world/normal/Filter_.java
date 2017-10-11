package com.hello.world.normal;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author yangguanbao
 * @date 14/03/2017
 */
public class Filter_ {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("hello");
        list.add("go");
        list.add(" world");
        list.add("to");
        list.add("fishing");

        Stream<String> s = list.stream();
        s.filter(x -> x.contains("hello") || x.contains(" world")).forEach(x -> System.out.print(x));
    }
}
