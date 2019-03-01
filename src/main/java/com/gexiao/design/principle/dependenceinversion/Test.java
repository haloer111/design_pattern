package com.gexiao.design.principle.dependenceinversion;

public class Test {
    public static void main(String[] args) {

        //v1
        /*Geely geely= new Geely();
        geely.studyJavaCourse();
        geely.studyJavaCourse();
*/

        //v2
      /*  Geely geely = new Geely();
        geely.studyImoocCourse(new JavaCourse());
        geely.studyImoocCourse(new FECourse());
        geely.studyImoocCourse(new PythonCourse());*/

        //v3
        Geely geely= new Geely();
//        geely.setiCourse(new JavaCourse());
//        geely.setiCourse(new FECourse());
        geely.studyImoocCourse();
    }


}
