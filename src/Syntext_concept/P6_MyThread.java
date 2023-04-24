package Syntext_concept;

public class P6_MyThread extends Thread {
    public int i=0;

    public P6_MyThread(int i){
        this.i=i;

    }

    @Override
    public void run(){
        try {
            System.out.println(i);
        }
        catch (Exception e){

        }

    }
}
