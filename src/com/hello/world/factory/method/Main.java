package com.hello.world.factory.method;

/**
 * 工厂方法模式，又简称为：工厂模式
 * 优点：克服了简单工厂违背开放-封闭原则的缺点，
 * 又保留了封装对象创建过程的优点,降低客户端和工厂的耦合性，
 * 所以说“工厂模式”是“简单工厂模式”的进一步抽象和推广。
 * 缺点：每增加一个产品，相应的也要增加一个子工厂，加大了额外的开发量。
 *
 * @author yangguanbao
 * @date 21/03/2017
 */
public class Main {
    public static void hello() {
        /// 业务方通知活动暂停
        // Business business = new Business();
        // business.active();
        System.out.println("it's finished");
    }

    public void setConfig(String config) {
        threadPoolTaskExecutor.execute(
            new Runnable() {
                @Override
                public void run() {
                    //执行其他耗时的业务处理...
                    this.config = config;
                }
            });
    }
}
