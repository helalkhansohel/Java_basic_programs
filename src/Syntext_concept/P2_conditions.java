package Syntext_concept;

public class P2_conditions {
    public static void main(String[] args) {
        int myAge=10, votingAge=23;

        //----------------bool + else if----------------------------------
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
        //------------------bool-------------------------------------
        int x = 10;
        System.out.println(x == 10); // returns true
        //--------------Ternary Operator------------------------
        x = 10;
        System.out.println(x == 10?"Yes":"No"); // returns true

        //----------------switch---------------------------------------
        switch(x) {
            case 1:
                System.out.println("Old enough to vote!");
                break;
            case 2:
                System.out.println("Not old enough to vote.");
                break;
            default:
                System.out.println("wrong ..");
        }

    }
}
