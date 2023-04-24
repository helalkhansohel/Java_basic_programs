package Syntext_concept;

public class P6_RunnableThread implements Runnable{

    @Override
    public void run(){
        try{
            System.out.println(Thread.currentThread().getId());
        }
        catch (Exception e){

        }
    }
}
