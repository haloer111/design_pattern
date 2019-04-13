package com.gexiao.design.creational.singleton;

/**
 * 双重检查锁-单例模式
 */
public class LazyDoubleCheckSingleton {
    /**
     * 重点1：使用的时候才创建，初始化为null
     * volatile 防止重排序
     */
    private volatile static LazyDoubleCheckSingleton lazySingleton = null;

    /**
     * 重点2：防止外部创建实例对象，无参构造器为私有属性
     */
    private LazyDoubleCheckSingleton() {
    }

    /**
     * 重点3：获取单个实例对象
     */
    public static LazyDoubleCheckSingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazySingleton == null) {
                    // 1.分配内存给这个对象
                    // 2.初始化这个对象
                    // 3.设置lazySingleton 指向刚才分配的内存
                    // ---------重排序-------
                    // 1.分配内存给这个对象
                    // 3.设置lazySingleton 指向刚才分配的内存
                    // 2.初始化这个对象
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySingleton;
    }
}
