package Baisc;

import java.util.Scanner;
//7.Write a program to sum of random numbers
public class P8_Random_number_generate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert Number:");
        int n = sc.nextInt();
        int sum = runSimulation( n );
        System.out.println("Sum: "+sum);
    }
    public static int runSimulation (int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            int temp = (int)(Math.random()*2.9999) + 1;
            sum += temp;
            System.out.print(temp + " ");
        }
        return sum;
    }
}
