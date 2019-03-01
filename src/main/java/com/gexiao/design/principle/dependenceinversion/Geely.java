package com.gexiao.design.principle.dependenceinversion;

public class Geely {
    //v2
  /*public void studyImoocCourse(ICourse iCourse){
      iCourse.studyCourse();
  }*/

    private ICourse iCourse;

    public Geely(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public Geely() {
    }

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}