package org.example;

public class Car {
    String color, brand, size;

    void printValue () {
        System.out.println("I have a car and color ->" + color + ", brand -> " + brand + " and seat size ->" + size);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "red";
        car1.size = "4";
        car1.brand = "benz";
        car1.printValue();

    }

}
