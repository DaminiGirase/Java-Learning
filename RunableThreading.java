class MyRunThread1 implements Runnable{
    public void run(){
       System.out.println("Add Bullets in Gun");
    }
}
class MyRunThread2 implements Runnable{
    public void run(){
       System.out.println("Gun is Ready to shoat");
    }
}

public class RunableThreading {
    public static void main(String[] args) {
        MyRunThread1 bullet1 = new MyRunThread1();
        Thread gun1 = new Thread(bullet1);
        MyRunThread2 bullet2 = new MyRunThread2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();

    }
}
