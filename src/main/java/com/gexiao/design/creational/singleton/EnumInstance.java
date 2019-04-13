package com.gexiao.design.creational.singleton;

public enum  EnumInstance {
    INSTANCE{
        protected void printTest(){
            System.out.println("test");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}
