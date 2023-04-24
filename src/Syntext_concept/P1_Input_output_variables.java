package Syntext_concept;

import java.util.Scanner;

public class P1_Input_output_variables {
    public static void main(String[] args) {
        //--------------Variables-----------------------------------------
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        final int myFinalNum = 15;
        //---------------------Output------------------------------------
        System.out.printf("111"); //cursor pointer line is in same line

        System.out.println("-333"); //cursor pointer line is in next line

        System.out.print(" 222 "); //cursor pointer line is in same line

        //---------------------Input------------------------------------

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String b=sc.next(); // takes a word
        String c=sc.nextLine(); //takes aline
        char val = sc.next().charAt(0);// Take first character from a string as input

        System.out.println(a+"-"+b+ "-"+c);







    }
}
