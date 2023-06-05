package head_first_design_pattern.tea_coffee_template_method_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage{


    @Override
    public String getUserInput() {
        String answer = null;
        System.out.print("Would you like milk and sugar with your coffee (y/n)? ");
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

    @Override
    public void brew() {
        System.out.println("Brew the coffee grinds");
    }

    @Override
    public void addCondiments() {
        System.out.println("Ad sugar and milk");

    }
}
