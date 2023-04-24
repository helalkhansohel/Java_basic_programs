package Syntext_concept;

public class P7_Break_Continue
{
    public static void main(String[] args) {

        P7_Break_Continue o=new P7_Break_Continue();
        o.MyBreak(); // 1 2
        o.MyContinue(); // 1 2 4 5

    }

    //Break :
    public void MyBreak(){
        System.out.println("Break");
       for(int i=1;i<=5;i++) {


            if (i == 3) {
                break;
            }
           System.out.println(i);
        }
    }

    public void MyContinue(){
        System.out.println("Continue");
        for(int i=1;i<=5;i++) {
            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }
    }
}
