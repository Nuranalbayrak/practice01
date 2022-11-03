package accessmodifiers1;

public class Car {
    public String brand="Ford";
    protected String model="camry";
    String color="white";
    private String carNumberPlate="Tr 34FC 6302";


    public void Start(){
        System.out.println("car start");
    }
    protected void Stop(){
        System.out.println("Car stop");
    }
    private void speed(){
        System.out.println("Car speed");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.carNumberPlate);
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.color);
        car1.Start();
        car1.Stop();
        car1.speed();
    }
}
