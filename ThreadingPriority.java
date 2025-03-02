class Exactly extends Thread{
    public Exactly(String name){
        super(name);
    }
    public void run(){
        System.out.println("The name is: "+ getName());  
    }
}
public class ThreadingPriority {
    public static void main(String[] args) {

        Exactly d = new Exactly("Damini");
        Exactly D = new Exactly("Dimple");
        Exactly t = new Exactly("Mukta");
        Exactly T = new Exactly("Ashwini");
        d.setPriority(Thread.MAX_PRIORITY);
      d.start();
      D.start();
      // use when print when above runing complete
      try{
        D.join();
      }
      catch(Exception e){
        System.out.println(e);
      }
       // stope exsicution
      try{
        Thread.sleep(346);
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
      t.start();
      T.start();
        
    }
}
