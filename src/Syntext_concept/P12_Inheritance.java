package Syntext_concept;

class Vehicle {
    protected String brand = "Ford";
    public void honk() {
        System.out.println("Tuut, tuut!");
    }
}

public class P12_Inheritance extends Vehicle {
    private String modelName = "Mustang";
    public static void main(String[] args) {

        P12_Inheritance myFastCar = new P12_Inheritance();
        myFastCar.honk();
        System.out.println(myFastCar.brand + " " + myFastCar.modelName);

    }

}
