package models;

public class Car {
    private String model;

    public Car(String brand, String model){
        super (brand);
        this.model = model;

    }

    public String getMOdel(){
        return model;
    }
    public void printBrand (){
        System.out.println(getBrand());
    }

    private String getBrand() {
    }
}
