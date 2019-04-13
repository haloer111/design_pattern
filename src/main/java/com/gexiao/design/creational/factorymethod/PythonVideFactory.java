package com.gexiao.design.creational.factorymethod;

public class PythonVideFactory extends VideoFactory{


    public Video getVideo() {
        return new PythonVideo();
    }
}
