package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Remove_All_the_space {
    public static void main(String[] args) {
        System.out.print("Input: ");
        Scanner se=new Scanner(System.in);

        String input=se.nextLine();

        ArrayList<String> a=new ArrayList<>(Arrays.asList(input.split(" ")));

        for (String x:a) {
            System.out.print(x);

        }

    }
}
