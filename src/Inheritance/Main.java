package Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mazda", 2943);

        System.out.println(car.getCarBrand());

        car.setCarBrand("Honda");

        Car[] carArray = {car, car, car};



    }
}
