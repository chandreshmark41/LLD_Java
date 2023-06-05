package head_first_design_pattern.tea_coffee_template_method_example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourBeverage();
        if(customerWantsCondiments()){
            addCondiments();
        }
        System.out.println("It's ready, let's get refresh.......");

    }

    public void boilWater() {
        System.out.println("Water is boiling");
    }

    public void pourBeverage() {
        System.out.println("Pour into cup");
    }

    public Boolean customerWantsCondiments(){
        String answer = getUserInput();
        if(answer.toLowerCase().startsWith("y")) {
            return true;
        }
        else{
            return false;
        }
    }




    public abstract String getUserInput();





    public abstract void brew();

    public abstract void addCondiments();

}
