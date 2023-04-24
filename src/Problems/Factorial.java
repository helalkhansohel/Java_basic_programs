package Problems;

import java.util.Scanner;
//7!, meaning 1 × 2 × 3 × 4 × 5 × 6 × 7.
public class Factorial {
    public static void main(String[] args) {
        System.out.print("Input number:");
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int result=1;
        for (int i=1;i<=input;i++){
            result=result*i;
        }
        System.out.println("Result: "+result);
    }
}
