package Syntext_concept;

//Data abstraction is the process of hiding certain details and showing only essential information to the user.
       // Abstraction can be achieved with either abstract classes or interfaces
      //  The abstract keyword is a non-access modifier, used for classes and methods:

       // Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

       // Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).

abstract class MyAnimal{  //abstract class
  public abstract void animalvoice(); //abstract method [declare but not defined]

  public void sleep(){  //Non abstract method
      System.out.println("sleep");
  }
}

class MyCat extends MyAnimal{
    public void animalvoice(){
        System.out.println("mew");
    }

}
public class p14_Abstruction {
    public static void main(String[] args) {
        MyCat o=new MyCat();
        o.animalvoice();
        o.sleep();
    }
}

