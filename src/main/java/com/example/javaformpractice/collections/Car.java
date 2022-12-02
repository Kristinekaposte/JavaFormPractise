package com.example.javaformpractice.collections;

import com.example.javaformpractice.BlackKnight;

import java.util.HashSet;
import java.util.Set;

public class Car {
    private String name;
    CarType carType;

    // constructor
    public Car (){
    }
    public Car(String name, CarType carType) {
        this.name = name;
        this.carType = carType;
    }
    public String getName() {
        return this.name;
    }

    public CarType getCarType() {
        return this.carType;
    }

    @Override
    public int hashCode() { //  we should get nr. back
        int result = 31 * name.trim().toLowerCase().hashCode() + carType.hashCode();

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // check for self
        if (o == null || getClass() != o.getClass())
            return false;   // if object is null or if they dont have same class return false
        Car car = (Car) o;
        return ( name.trim().equalsIgnoreCase(car.getName().trim())) &&
              //  name.equals(car.getName()) &&
                (carType.equals(car.getCarType()));
    }

    public static void main(String[] args) {
        Car car = new Car("mazda   ",CarType.AUTOMATIC);
        Car car2 = new Car("mAzda  ",CarType.AUTOMATIC);
        Car car3 = new Car("mazda", CarType.MANUAL);

        System.out.println(car.equals(car2));

        System.out.println(car.hashCode() == car2.hashCode());
    }


}


// create a class Car with fields name and
// type (enum for automatic and manual)
// and implement the equals and hashCode methods

// volvo == VOLVO // true
// "mazda" == " maZda " // true



// System.out.println(car.hashCode() == car2.hashCode());