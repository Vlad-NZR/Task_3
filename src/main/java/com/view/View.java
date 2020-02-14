package com.view;

public class View {

    public static final String FAMILY_NAME_REGEX ="[A-Z][a-z]{1,20}";
    public static final String LOGIN_REGEX = "[a-zA-z0-9_$]{5,12}";


    public void printMessage(String message){
        System.out.println(message);
    }
}
