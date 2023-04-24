package Problems;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {

        System.out.print("Input number:");
        Scanner sc=new Scanner(System.in);

        String inp=sc.nextLine();


        String reverse="";

        for (int i=inp.length()-1;i>=0;i--){
            reverse=reverse+inp.charAt(i);

        }

        if(inp.compareTo(reverse)==0){ // compare

            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
            System.out.println("Reverse: "+reverse);
        }
    }
}
