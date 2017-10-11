package com.hello.world.memento;

/**
 * @author yangguanbao
 * @date 17/03/2017
 */
class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("dabaoge");
        p.setDept("ICBU");
        p.setSayWhat("hello world");

        //皇帝的大内总管
        MementoManager m = new MementoManager();
        MementoSay say = p.recordInfo();
        m.setMementoSay(say);

        p.setSayWhat("!@#$!@$!#%$%^#^$&##$%@#");

        p.reset(say);

        System.out.println(p.getSayWhat());
    }
}
