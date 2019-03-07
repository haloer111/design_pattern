package com.gexiao.design.principle.liskovsubstitution.methodinput;

import java.util.Map;

public class Child extends Base {
//    @Override
//    public void method(HashMap hashMap) {
//        System.out.println("子类HashMap被执行");
//    }

    public void method(Map map) {
        System.out.println("子类Map被执行");
        ;
    }
}
