package Syntext_concept;

interface NewAnimal{
    public  void animalvoice();
     public void sleep();

}

class NewCat implements NewAnimal {
    public void animalvoice(){
        System.out.println("mew meu ");
    }

    public void sleep() {
        System.out.println("ZZZ");
    }

}

public class P15_Interface {

    public static void main(String[] args) {

        NewCat n=new NewCat();
        n.animalvoice();
        n.sleep();
    }
}
