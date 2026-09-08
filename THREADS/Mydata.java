package THREADS;
 class  Mydata1 extends Thread {

    public void run(){
        System.out.println("Print Data");
    }
}

public class Mydata{
    public static void main(String[] args) {
        Mydata1 obj = new Mydata1();
        obj.start();
    }
}
