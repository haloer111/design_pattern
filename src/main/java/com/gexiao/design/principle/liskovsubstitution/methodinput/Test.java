package com.gexiao.design.principle.liskovsubstitution.methodinput;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        Base child =new Child();
       // HashMap hashMap = new HashMap();
        HashMap map = new HashMap();
        child.method(map);
    }
}
