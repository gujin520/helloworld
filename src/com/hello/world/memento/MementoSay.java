package com.hello.world.memento;

/**
 * @author yangguanbao
 * @date 17/03/2017
 */
public class MementoSay {
    public String getSayWhat() {
        return sayWhat;
    }

    public void setSayWhat(String sayWhat) {
        this.sayWhat = sayWhat;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    String name;
    String dept;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String sayWhat;
}
