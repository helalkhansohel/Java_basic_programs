package Problems;

//How do you swap two numbers without using a third variable in Java?
public class SwapNumbers {

    public static void main(String[] args) {
        int a=1, b=2;
        System.out.println("a:"+a+" b:"+b);
        a=a+b; //3
        b=a-b; //1
        a=a-b; //2
        System.out.println("a:"+a+" b:"+b);

    }
}
