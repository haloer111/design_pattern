package com.gexiao.design.creational.singleton;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉式单例模式
 */
public class LazySingleton implements Serializable {

    /**
     * 重点1：使用的时候才创建，初始化为null
     */
    private static LazySingleton lazySingleton = null;


    /**
     * 重点2：防止外部创建实例对象，无参构造器为私有属性
     */
    private LazySingleton() {
        if (lazySingleton != null) {
            throw new RuntimeException("禁止反射生成");
        }
    }

    ;


    /**
     * 重点3：获取单个实例对象
     */
    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    private Object readResolve() {
        return lazySingleton;
    }

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, NoSuchFieldException {

//                LazySingleton instance = LazySingleton.getInstance();
//        System.out.println("instance = " + instance);
//
//        Class<LazySingleton> lazySingletonClass = LazySingleton.class;
//        Field flag = lazySingletonClass.getDeclaredField("flag");
//        flag.setAccessible(true);
//        flag.set(flag,true);
//        Constructor<LazySingleton> constructor = lazySingletonClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        LazySingleton newInstance = constructor.newInstance();
//        System.out.println("newInstance = " + newInstance);
//
//
//
//        System.out.println(instance==newInstance);
    }
}
