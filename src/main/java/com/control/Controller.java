package com.control;

import com.model.Model;
import com.view.View;
import java.util.Scanner;
import java.util.Locale;
import java.util.ResourceBundle;

public class Controller {
    private Model model;
    private View view;
    private Locale ukr = new Locale("uk");
    private ResourceBundle rb = ResourceBundle.getBundle("text",ukr);

    public Controller(){
        this.model = new Model();
        this.view = new View();
    }
    // The Utility methods
    public String inputFamilyString(Scanner sc) {
        view.printMessage(rb.getString("str1"));
        String input = sc.next();
        while( !(input.matches(View.FAMILY_NAME_REGEX))) {
            view.printMessage(rb.getString("str3"));
            input = sc.next();
        }
        return input;
    }

    public String inputLogInString(Scanner sc) {
        view.printMessage(rb.getString("str2"));
        String input = sc.next();
        while( ! (input.matches(view.LOGIN_REGEX))) {
            view.printMessage(rb.getString("str2"));
            input = sc.next();
        }
        return input;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        model.setFamilyName(inputFamilyString(sc));
        model.setLogIn(inputLogInString(sc));
    }
}
