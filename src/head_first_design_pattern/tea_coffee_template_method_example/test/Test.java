package head_first_design_pattern.tea_coffee_template_method_example.test;

import head_first_design_pattern.tea_coffee_template_method_example.CaffeineBeverage;
import head_first_design_pattern.tea_coffee_template_method_example.Coffee;
import head_first_design_pattern.tea_coffee_template_method_example.Tea;

public class Test {

    public static void main(String[] args) {

        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();

    }
}
