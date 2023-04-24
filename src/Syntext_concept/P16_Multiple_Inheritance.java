package Syntext_concept;

interface A{
    void foo();
}

interface B{
    void goo();
}

class C implements A, B {
    public void foo(){
        System.out.println("A");
    }

    public void goo(){
        System.out.println("B");
    }
}

//public class P16_Multiple_Inheritance{
//    public static void main(String[] args)  {
//        C c = new C();
//        c.foo();
//        c.goo();
//    }


    //---------------------or--------------------------------------------------------------------

    public class P16_Multiple_Inheritance extends C {
        public static void main(String[] args)  {
            P16_Multiple_Inheritance c = new P16_Multiple_Inheritance();
            c.foo();
            c.goo();
        }
}