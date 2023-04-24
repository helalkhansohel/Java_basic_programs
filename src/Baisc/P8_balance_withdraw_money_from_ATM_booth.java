package Baisc;

import java.util.Scanner;
//8.Write a program to check balance and withdraw money from ATM booth using if else and
//switch case
public class P8_balance_withdraw_money_from_ATM_booth {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double Balance=10000,withdraw=0;
        int d,pin,Userpin=1234;
        System.out.println("** ATM  ** \n\n");
        System.out.println("Welcome to you acccount.\n");
        System.out.println("Please insert PIN:");
        pin= sc.nextInt();
        if(pin==Userpin){

            System.out.println("To see your Balance, Press 1.\nTo withdraw money, Press 2.\n");
            d=sc.nextInt();;
            switch(d){
                case 1:
                    System.out.println("User Balance is "+Balance+" TK\n");
                    break;
                case 2:
                    System.out.println("How much money you want to withdeaw ?");
                    withdraw= sc.nextInt();
                    if(withdraw<Balance){
                        Balance=Balance-withdraw;
                        System.out.println("Your current Balance is "+Balance+" TK\n\n");
                        System.out.println("Thank you ..!\n");
                    }
                    else{
                        System.out.println("Withdraw money is more the Balance.\n");
                        System.out.println("Thank you ..!\n");
                    }

                    break;
                default:
                    System.out.println("Wrong input ...!!!\n");

            }
        }
        else{
            System.out.println("Wrong PIN ...!!!\n");
        }


    }
}
