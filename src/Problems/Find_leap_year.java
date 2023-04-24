package Problems;
import java.util.Scanner;
//3.Write a program that takes a year from user and print whether that year is a leap
//year or not
public class Find_leap_year {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a,flag=0;
        System.out.println("Enter Year:");
        a= sc.nextInt();

        if(a%400==0){
            flag=1;
        }

        else if(a%100==0){
            flag=0;
        }

        else if(a%4==0){
            flag=1;
        }

        else {
            flag=0;
        }
        if(flag==1){
            System.out.println("Year "+a+" is a leap year.");
        }
        else {
            System.out.println("Year "+a+" is not a leap year.");
        }

    }
}
