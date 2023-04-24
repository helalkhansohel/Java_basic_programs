package Baisc;

import java.sql.SQLOutput;
import java.util.Scanner;

public class P6_Find_Grade {

    public static void main(String[] args) {

        String Grade="";
        System.out.println("Please input your achieved number in English subject:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if(n>100 || n<0){
            Grade="wrong input ..!!!!";
        } else if (n>=90 && n<=100) {
            Grade="Your Grade is A";
        }

        else if (n>=80 && n<=89) {
            Grade="Your Grade is B";
        }
        else if (n>=70 && n<=79) {
            Grade="Your Grade is C";
        }

        else if (n>=60 && n<=69) {
            Grade="Your Grade is D";
        }
        else {
            Grade="Your Grade is F" ;
        }

        System.out.println(Grade);
    }
}
