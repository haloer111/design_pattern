package com.gexiao.design.creational.simplefactory;

public class VideoFactory {
    /*public static Video getVideo(String type) {
        switch (type) {
            case "java":
                return new JavaVideo();

            case "python":
                return new PythonVideo();
        }
        return null;
    }*/

   public static Video getVideo(Class c){
       Video video =null;
       try {
           video = (Video) Class.forName(c.getName()).newInstance();
       } catch (InstantiationException e) {
           e.printStackTrace();
       } catch (IllegalAccessException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       return video;
   }
}
