package com.hello.world.chain;

/**
 * @author yangguanbao
 * @date 15/03/2017
 */
abstract class  Handler {

    private Handler nextHandler;

    /**
     * 具体事项
     */
    public abstract void doSth();

    protected void doNext(){
        if (nextHandler != null){
            nextHandler.doSth();
        }
    }

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
