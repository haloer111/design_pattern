package com.gexiao.design.principle.liskovsubstitution;

public class Test {
    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth()<=rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth()+1);
            System.out.println("width:"+rectangle.getWidth()+",length:"+rectangle.getLength());
        }
    }

    public static void main(String[] args) {
//        Rectangle rectangle =  new Rectangle();
//        rectangle.setWidth(5);
//        rectangle.setLength(10);
//        resize(rectangle);
        Square square = new Square();
       square.setSideLength(10);
      //  resize(square);
    }
}
