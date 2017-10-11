package com.hello.world.template.method;

/**
 * @author yangguanbao
 * @date 13/03/2017
 */
public interface Communicate {

    /**
     *
     */
    default void say(){
        System.out.println("hi");
    }

    /**
     * 聆听某个人说话
     * @param p 聆听的对象
     */
    void listen(AbstractPerson p);

    /**
     * 和某人说话
     * @param p 说话的对象
     */
    void sayTo(AbstractPerson p);

}
