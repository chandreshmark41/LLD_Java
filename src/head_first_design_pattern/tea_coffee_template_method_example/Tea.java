package head_first_design_pattern.tea_coffee_template_method_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Tea extends CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Steep the teabag in the water");

    }

    @Override
    public void addCondiments() {
        System.out.println("Add Lemon");

    }

    public String getUserInput() {
        String answer = null;
        System.out.print("Would you like to add lemon in your tea (y/n)? ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
