package Syntext_concept;

public class P9_Constructor {

   static int x;

    public P9_Constructor(int x){
        this.x=x;
    }

    public static void main(String[] args) {

        P9_Constructor o=new P9_Constructor(1);
        System.out.println(x);

    }

}
