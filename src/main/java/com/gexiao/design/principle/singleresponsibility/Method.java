package com.gexiao.design.principle.singleresponsibility;

public class Method {
    private void updateUserInfo( String userName,String address){
        userName= "geely";
        address = "七星路";
    }
    private void updateUserInfo( String userName,String... properties){
        userName= "geely";
//        address = "七星路";
    }

    private void updateUsername( String userName){
        userName= "geely";

    }  private void updateAddress (String address){
        address= "geely";

    }
}
