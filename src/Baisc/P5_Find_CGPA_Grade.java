package Baisc;

import java.util.Scanner;
//5.Write a program to calculate CGPA and find grade
public class P5_Find_CGPA_Grade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double sub1,sub2,sub3,sub4;
        double cgpa;
        String  grade="";
        System.out.println("Input Subject-1 number(0 to 100): " );
        sub1=sc.nextInt();;
        System.out.println("Input Subject-2 number(0 to 100): " );
        sub2=sc.nextInt();;
        System.out.println("Input Subject-3 number(0 to 100): " );
        sub3=sc.nextInt();;
        System.out.println("Input Subject-4 number(0 to 100): " );
        sub4=sc.nextInt();;
        cgpa=(sub1+sub2+sub3+sub4)/100;

        System.out.println("CGPA :" + cgpa);

        if (cgpa<1){
            grade="F";
        }
        else if(cgpa<2 && cgpa>=1){
            grade="D";
        }
        else if(cgpa< 3 && cgpa>=2){
            grade="C";
        }
        else if(cgpa<3.5 && cgpa>=3){
            grade="B";
        }
        else if(cgpa>=3.5){
            grade="A";
        }
        else{
            System.out.println("Wrong insert !!!");
        }

        System.out.println("Grade: "+grade);
    }
}
