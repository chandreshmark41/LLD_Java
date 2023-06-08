package head_first_design_pattern.menu_iterator_example;

public class MenuTestDrive {

    public static void main(String args[]){
        PanCakeHouseMenu panCakeHouseMenu = new PanCakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(panCakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
