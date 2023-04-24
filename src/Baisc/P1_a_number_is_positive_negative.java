
package Baisc;


import java.util.Scanner;
//1.Write a program to get a number from the user and print whether it is positive or
//negative.
public class P1_a_number_is_positive_negative {

    public static void main(String[] args) {
        System.out.println("Please insert a number:");


        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();

        if(a>0){
            System.out.println("Positive");
        }

        else if(a<0){
            System.out.println("Negative");
        }
        else {
            System.out.println("Number in 0");
        }


    }
}
