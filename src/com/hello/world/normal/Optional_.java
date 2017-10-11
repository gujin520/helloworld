package com.hello.world.normal;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * @author yangguanbao
 * @date 14/03/2017
 */
public class Optional_ {
    private static List<Optional<String>> get() {
        List<String> list = new ArrayList<String>(6);
        list.add("hello ");
        list.add(null);
        list.add("world");

        List<Optional<String>> returnList = new ArrayList<Optional<String>>(3);
        for (String temp : list) {
            Optional<String> optional = Optional.ofNullable(temp);
            returnList.add(optional);
        }

        return returnList;
    }

    public static void main(String[] args) {
        List<Optional<String>> getList = get();
        for (Optional<String> temp : getList) {
            if (temp != null) {
                try{
                    String str = temp.get();
                    System.out.print(str);
                }catch(NoSuchElementException e){}
            }
        }
    }
}
