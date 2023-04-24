package Baisc;

import java.util.Scanner;
//2.Take three numbers from the user and print the greatest number
public class P2_largest_number_among_3_inputs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter first number:");
        a= sc.nextInt();

        System.out.println("Enter first number:");
        b= sc.nextInt();

        System.out.println("Enter first number:");
        c= sc.nextInt();
        System.out.println("Max:");
        if(a>b){
            if(a>c){
                System.out.println(a);

            }
            else {
                if(c>b){
                    System.out.println(c);
                }
                else {
                    System.out.println(b);
                }
            }


        }

        else {
            if(b>c){
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }
        }


    }
}
