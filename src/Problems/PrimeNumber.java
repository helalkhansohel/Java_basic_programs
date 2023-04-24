package Problems;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        int flage=0;


        for (int i=2;i<=input/2;i++){
            if(input%i==0){
                flage=1;
            }

        }

        if(flage!=1 && input!=1){
            System.out.println("Number is prime");

        }
        else {
            System.out.println("Number is not prime");
        }

    }

}
