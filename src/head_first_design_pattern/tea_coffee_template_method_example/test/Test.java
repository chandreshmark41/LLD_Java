package head_first_design_pattern.tea_coffee_template_method_example.test;

import head_first_design_pattern.tea_coffee_template_method_example.CaffeineBeverage;
import head_first_design_pattern.tea_coffee_template_method_example.Coffee;
import head_first_design_pattern.tea_coffee_template_method_example.Tea;

import javax.swing.*;
import java.awt.*;

public class Test extends JFrame {

    public Test(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setVisible(true);
    }

    public void paint(Graphics graphics){
        super.paint(graphics);
        String msg = "I Rule !!!!";
        graphics.drawString(msg, 100, 100);
    }

    public static void main(String[] args) {

        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        Test testFrame = new Test("New Window");

    }
}
