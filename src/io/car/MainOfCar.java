package io.car;

public class MainOfCar {
    public static void main(String[] args) {
        Car car1=new Car("Lamborghini Huracan","LP 580-2");
        System.out.println("Version: "+Car.numberOfCar);
        Car car2=new Car("Lamborghini Huracan","LP 610-4");
        System.out.println("Version: "+Car.numberOfCar);
        Car car3=new Car("Lamborghini Huracan","Performante");
        System.out.println("Version: "+Car.numberOfCar);
        Car car4=new Car("Lamborghini Aventador S","LP 700-4");
        System.out.println("Version: "+Car.numberOfCar);

    }
}
