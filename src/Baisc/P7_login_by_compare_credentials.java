package Baisc;

import java.util.Scanner;
//6.Write a program to check if the provided user credentials are valid during login
public class P7_login_by_compare_credentials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Database_username="Admin",Database_password="Admin";

        System.out.println("Input username:" );
        String username= sc.nextLine();
        System.out.println("Input password:" );
        String password=sc.nextLine();


        if (Database_username.compareTo(username)==0 && Database_password.compareTo(username)==0){
            System.out.println("Successful Login");
        }

        else{
            System.out.println("Wrong username or password !!!");
        }
    }
}
