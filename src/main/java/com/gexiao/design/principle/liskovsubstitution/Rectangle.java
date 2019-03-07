package com.gexiao.design.principle.liskovsubstitution;

public class Rectangle extends Quadrangle{
    private long length;
    private long width;


    @Override
    long getWidth() {
        return width;
    }

    @Override
    long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
