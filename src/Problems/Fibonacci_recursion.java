package Problems;

import java.util.Scanner;
//a ,b, c
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144.
//   a b c
public class Fibonacci_recursion {

    public static void Fibonacci(int range){

        int a=0;
        int b=1;
        int c=1;

        for(int i=0;i<=range;i++){
            System.out.print(a+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Input Range: ");
        Fibonacci(sc.nextInt());
    }
}
