package accessmodifiers2;

import accessmodifiers1.Car;

public class CarModel extends Car {
    public static void main(String[] args) {
        Car car3= new Car();
        System.out.println(car3.brand);
        CarModel carmodel1= new CarModel();
        System.out.println(carmodel1.model);
        car3.Start();
        carmodel1.Stop();
    }
}
