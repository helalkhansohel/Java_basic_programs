package Problems;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        System.out.print("Input number:");

        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        if(input%2==0){
            System.out.print("Number is Even");
        }
        else {
            System.out.print("Number is Odd");
        }
    }
}
