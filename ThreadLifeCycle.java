class Damini extends Thread{
 public Damini(String name){
    super(name);
 }
    public void run(){
        System.out.println("Damini Girase");
    }
}
public class ThreadLifeCycle {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Damini sc = new Damini("Damini Rajput");
        sc.start();
        System.out.println("The id of Thread is: "+ sc.getId());
       System.out.println("The name is: "+ sc.getName());
    }
}
