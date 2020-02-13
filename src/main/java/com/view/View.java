package com.view;

public class View {
    public static final String INPUT_FAMILY_NAME ="Please enter your family name ";
    public static final String INPUT_LOGIN ="Please enter your login ";
    public static final String WRONG_INPUT = "Incorrect input,please try again";
    public static final String FAMILY_NAME_REGEX ="[A-Z][a-z]{1,20}";
    public static final String LOGIN_REGEX = "[a-zA-z0-9_$]{5,12}";


    public void printMessage(String message){
        System.out.println(message);
    }
}
