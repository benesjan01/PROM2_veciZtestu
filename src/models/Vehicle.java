package models;

public abstract class Vehicle {
    public String brand;

    public Vehicle(String brand){

        this.brand = brand;

    }
    public String getBrand(){
        return brand;
    }
}
