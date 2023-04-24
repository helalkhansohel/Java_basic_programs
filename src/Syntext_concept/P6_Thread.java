package Syntext_concept;



public class P6_Thread {
    public static void main(String[] args) {

        for (int j=1;j<=5;j++) {
            P6_MyThread ob1 = new P6_MyThread(j);
            ob1.start();

            Thread ob2=new Thread(new P6_RunnableThread());
            ob2.start();
        }
    }

}

