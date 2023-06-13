package head_first_design_pattern.menu_iterator_example;

public class Waitress {
    Menu panCakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu panCakeHouseMenu, Menu dinerMenu) {
        this.panCakeHouseMenu = panCakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator panCakeIterator = panCakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        System.out.println("MENU\n ----\nBREAKFAST");
        printMenu(panCakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
        //System.out.println(dinerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName());
            System.out.println(menuItem.getPrice());
            System.out.println(menuItem.getDescription());
        }
    }
}
