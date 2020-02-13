package com.control;
import com.model.Model;
import com.view.View;
import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(){
        this.model = new Model();
        this.view = new View();
    }
    // The Utility methods
    public String inputFamilyString(Scanner sc) {
        view.printMessage(View.INPUT_FAMILY_NAME);
        String input = sc.next();
        while( !(input.matches(View.FAMILY_NAME_REGEX))) {
            view.printMessage(View.WRONG_INPUT);
            input = sc.next();
        }
        return input;
    }

    public String inputLogInString(Scanner sc) {
        view.printMessage(View.INPUT_LOGIN);
        String input = sc.next();
        while( ! (input.matches(view.LOGIN_REGEX))) {
            view.printMessage(View.WRONG_INPUT);
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
