package design_patterns.creational.builder;

public class Shop {

    public static void main(String a[]) {
        Phone phone = new PhoneBuilder().setOs("Android").setRam(8).setBattery(5000).getPhone();
        System.out.println(phone);
        //System.out.println("done");
    }
}
