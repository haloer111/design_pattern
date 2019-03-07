package com.gexiao.design.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;

public class Child extends Base {
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method执行");
        return hashMap;
    }
}
