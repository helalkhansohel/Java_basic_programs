package Syntext_concept;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Cat extends Animal {
    public void animalSound() {
        System.out.println("The Cat says: mwe mwe");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
public class P13_Polymorphism {

    public static void main(String[] args) {
     Animal o1=new Animal();
     Animal o2=new Cat(); // or  Cat o2=new Cat();
     Animal o3=new Dog(); // or Dog o3=new Dog();

     o1.animalSound();
     o2.animalSound();
     o3.animalSound();
    }

}
