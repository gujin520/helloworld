package com.hello.world.normal;

import java.lang.reflect.Field;

/**
 * @author yangguanbao
 * @date 23/03/2017
 */
class HelloWorldPrivateModify {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        HelloWordPrivate no = new HelloWordPrivate();
        HelloWordPrivate changed = CopyUtils.copy(no);
        System.out.println(changed.toString());
    }

}

abstract class CopyUtils {
    @SuppressWarnings("AlibabaAvoidCommentBehindStatement")
    public static <T> T copy(T t) throws IllegalAccessException, InstantiationException {
        Field[] fields = t.getClass().getDeclaredFields();
        for (Field temp : fields) {
            temp.setAccessible(true);
            Object val = temp.get(t);
            String type = temp.getType().toString();
            if (type.endsWith("String")) {
                temp.set(t, "hello world");
            } else {}
        }
        return t;
    }
}

class HelloWordPrivate {
    private String name = "no value";

    @Override
    public String toString() {
        return name;
    }
}


