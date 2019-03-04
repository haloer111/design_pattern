package com.gexiao.design.principle.singleresponsibility;

public class Bird {
    public void maniMoveMode(String name){
        System.out.println(name+"用翅膀飞");
        if ("鸵鸟".equals(name)){
            System.out.println(name+"用脚走");
        }
    }
}
