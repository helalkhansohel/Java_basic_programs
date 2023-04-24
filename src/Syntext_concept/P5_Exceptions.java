package Syntext_concept;

public class P5_Exceptions {
    public static void main(String[] args) {


        //========================Try catch ==============================================
        try {  // code body
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) { //catch the exceptions
            System.out.println("Something went wrong.");
        } finally { //The finally statement lets you execute code, after try...catch, regardless of the result:
            System.out.println("The 'try catch' is finished.");
        }



    }

    //================== throw ++++++++++++++++++++++++
    public void add(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
