package com.hello.world.abstractfactory;

/**
 * @author yangguanbao
 * @date 21/03/2017
 * 简单工厂又称为静态工厂，根据入参决定来创建谁。
 * 最大的优点是把客户端代码的判断收拢至简单工厂类中。
 * 简单工厂模式违背了“开放封闭原则
 */
public class WorldFactory implements IFactry {

    @Override
    public BaseUpperWords makeUpperWordsObject() {
        return null;
    }

    @Override
    public BaseLowerWords makeLowerWordsObject() {
        return null;
    }
}
