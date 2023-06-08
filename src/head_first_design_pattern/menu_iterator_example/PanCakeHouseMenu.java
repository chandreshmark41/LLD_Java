package head_first_design_pattern.menu_iterator_example;

import java.awt.*;
import java.util.ArrayList;

public class PanCakeHouseMenu {
    ArrayList menuItems;

    public PanCakeHouseMenu() {
        menuItems =  new ArrayList();

        addItem("K&B’s Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);


    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new PanCakeHouseMenuIterator(menuItems);
    }

//    public ArrayList getMenuItems() {
//        return menuItems;
//    }
}
