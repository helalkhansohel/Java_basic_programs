package Baisc;

public class P9_Recursion {
    public static void main(String[] args) {
        P9_Recursion ob=new P9_Recursion();
        int result=ob.MyRecursive(10);
        System.out.println(result);

    }
    public int MyRecursive(int k){

        if(k>0){
            return MyRecursive((k-1));
        }
        else {
            return 0;
        }
    }
}
