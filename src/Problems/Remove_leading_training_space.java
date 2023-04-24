package Problems;

import java.util.Scanner;

public class Remove_leading_training_space {

    public static void main(String[] args) {

        System.out.print("Input number:");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        System.out.println(input);
        System.out.println(input.strip());
    }
}
