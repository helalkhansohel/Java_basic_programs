package Baisc;

import java.util.Scanner;
//4.Write a program to check if inputted letter is small or capital
public class P4_find_small_capital_letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert 1 character:");
        char val = sc.next().charAt(0);  // consider the first character
        System.out.println("Character: "+val);
        if (Character.isUpperCase(val)) {
            System.out.println("Character is in Uppercase!");
        }else {
            System.out.println("Character is in Lowercase!");
        }
    }
}
