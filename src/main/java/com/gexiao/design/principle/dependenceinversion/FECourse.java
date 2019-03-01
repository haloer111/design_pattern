package com.gexiao.design.principle.dependenceinversion;

public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("geely在学习FE课程");

    }
}
