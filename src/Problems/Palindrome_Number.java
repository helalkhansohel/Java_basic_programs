package Problems;

import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {

        System.out.print("Input number:");
        Scanner sc=new Scanner(System.in);

        int inp=sc.nextInt();
        String input= Integer.toString(inp); //Int to String

        String reverse="";

        for (int i=input.length()-1;i>=0;i--){
            reverse=reverse+input.charAt(i);

        }

      //  if(inp==Integer.parseInt(reverse)){ // string to int
            if(input.compareTo(reverse)==0){ // string to int

            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
            System.out.println("Reverse: "+reverse);
        }
    }

}
