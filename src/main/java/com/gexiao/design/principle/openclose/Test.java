package com.gexiao.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "java课程", 348d);
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程id：" + javaDiscountCourse.getId()
                          + "课程名称" + javaDiscountCourse.getName()
                          + "课程折后价格" + javaDiscountCourse.getPrice()
                          + "课程价格" + javaDiscountCourse.getOriginPrice());
    }
}
