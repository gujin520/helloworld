package com.hello.world.simple.factory;

/**
 * @author yangguanbao
 * @date 21/03/2017
 */
public class Main {
    public static void main(String[] args) {
        BaseWords helloWords = WordsFactory.makeWordsObject("hello");
        BaseWords worldWords = WordsFactory.makeWordsObject("world");
        helloWords.say();
        worldWords.say();
    }
}
