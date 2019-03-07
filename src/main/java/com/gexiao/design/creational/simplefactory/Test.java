package com.gexiao.design.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
       // Video video = new JavaVideo();
      //  VideoFactory videoFactory = new VideoFactory();
        Video video = VideoFactory.getVideo(JavaVideo.class);
        video.product();
    }
}
