package accessmodifiers1;

public class CarRunner {
    public static void main(String[] args) {
        Car car2=new Car();
        System.out.println(car2.model);
        System.out.println(car2.brand);
        System.out.println(car2.color);
        car2.Stop();
        car2.Start();
    }
}
