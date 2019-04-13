package com.gexiao.design.creational.singleton;


/**
 * 静态内部类的单利模式
 */
public class StaticInnerClassSingleton {
    private static class InnerClass {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }

    private StaticInnerClassSingleton() {
    }
}
