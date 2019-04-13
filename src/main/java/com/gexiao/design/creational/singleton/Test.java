package com.gexiao.design.creational.singleton;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //  LazySingleton instance = LazySingleton.getInstance();
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        t1.start();
        t2.start();
//
        System.out.println("program end");

//        LazySingleton instance = LazySingleton.getInstance();
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.setData(new Object());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
////        LazySingleton instance1 = (LazySingleton) ois.readObject();
//        EnumInstance instance1 = (EnumInstance) ois.readObject();
//        System.out.println("instance:" + instance.getData());
//        System.out.println("instance1:" + instance1.getData());
//        System.out.println(instance1.getData() == instance.getData());


//        HungrySingleton singleton = HungrySingleton.getSingleton();
//        System.out.println("singleton = " + singleton);
//
//        Class<HungrySingleton> hungrySingletonClass = HungrySingleton.class;
//        Constructor<HungrySingleton> constructor = hungrySingletonClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        HungrySingleton newInstance = constructor.newInstance();
//        System.out.println("newInstance = " + newInstance);
//
//
//        System.out.println(newInstance==singleton);

//        LazySingleton instance = LazySingleton.getInstance();
//        EnumInstance instance = EnumInstance.getInstance();
//        instance.printTest();
//        Class<EnumInstance> enumInstanceClass = EnumInstance.class;
//        Constructor<EnumInstance> declaredConstructor = enumInstanceClass.getDeclaredConstructor(String.class,int.class);
//        declaredConstructor.setAccessible(true);
//        declaredConstructor.newInstance("aaa",111);
//        System.out.println("instance = " + instance);
//
//        Class<LazySingleton> lazySingletonClass = LazySingleton.class;
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
