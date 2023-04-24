package Problems;

public class Reverse_string {

    public static void main(String[] args) {
        String name="helal";
        String reverse="";

        int size=name.length();

        for (int i=size-1;i>=0;i--){
            reverse=reverse+name.charAt(i);
        }

        System.out.println(reverse);
    }
}
