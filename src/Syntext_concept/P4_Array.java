package Syntext_concept;

public class P4_Array {
    public static void main(String[] args) {
        //----------Single dimensional Arrays ----------------------------
        String[] color={"Red","Green","Blue"}; // 0,1,2

        System.out.println(color[1]);

        color[2]="Sky";
        for (String x: color) {
            System.out.print(x+" ");
        }
        //----------Single dimensional Arrays ----------------------------
       int[][] myNumbers={{1,2,3,4}, {5,6,7}}; //0,1
        System.out.println(myNumbers[1][2]); // Outputs 7
    }
}
