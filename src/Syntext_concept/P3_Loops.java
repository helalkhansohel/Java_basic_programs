package Syntext_concept;

public class P3_Loops {
    public static void main(String[] args) {

        //----------------while---------------
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        //-------------for--------------------
        for(i=1;i<=5;i++){
            System.out.println(i);
        }

       //------------------foreach-------------
       String[] color={"Green", "Rend", "Blue"};
        for (String c: color)
              {
                  System.out.println(c);
              }
    }
}
