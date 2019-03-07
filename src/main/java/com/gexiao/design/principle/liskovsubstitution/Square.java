package com.gexiao.design.principle.liskovsubstitution;

public class Square extends Quadrangle {
    private long sideLength;

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    long getWidth() {
        return sideLength;
    }

    @Override
    long getLength() {
        return sideLength;
    }
}
