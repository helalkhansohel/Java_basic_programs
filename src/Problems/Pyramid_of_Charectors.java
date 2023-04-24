package Problems;

import java.util.Scanner;

public class Pyramid_of_Charectors {

    public static void main(String[] args) {
        System.out.print("Input number:");
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        for (int x=1;x<=input;x++){

            for (int y=1;y<=input-x;y++) {
                System.out.print(" ");
            }
            for (int y=1;y<=x;y++) {
                System.out.print("* ");
            }


            System.out.println();
        }

    }
}
