package com.hello.world.memento;

/**
 * @author yangguanbao
 * @date 17/03/2017
 */
public class Person {
    MementoSay say;
    String name;
    String dept;
    String sayWhat;

    public MementoSay recordInfo(){
        MementoSay m = new MementoSay();
        m.setSayWhat(sayWhat);
        m.setName(name);
        m.setDept(dept);
        return m;
    }

    public void reset(MementoSay say) {
        this.say = say;
        this.name = say.getName();
        this.dept = say.getDept();
        this.sayWhat = say.getSayWhat();
    }

    public MementoSay getSay() {
        return say;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

}
