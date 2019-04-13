package com.gexiao.design.creational.singleton;

public class HungrySingleton {
    // 第一种
//    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    // 第二种
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }


    public static HungrySingleton getSingleton() {
        return hungrySingleton;
    }

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("禁止反射生成");
        }
    }
}
