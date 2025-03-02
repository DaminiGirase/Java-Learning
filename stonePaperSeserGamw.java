import java.util.Random;
import java.util.Scanner;
public class stonePaperSeserGamw {

   public static void main(String[] args) {
    System.out.println("Enter 0 for Stone 1 for Paper and 2 for Siser");
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
   int userOutput = sc.nextInt();

  Random random = new Random();
  int computerOutput  = random.nextInt( 3);

if(userOutput == computerOutput){
    System.out.println("Draw");
}
else if(userOutput == 0 && computerOutput == 2 || userOutput == 1 && computerOutput == 0 || userOutput == 2 && computerOutput == 1){
    System.out.println("You Win");
}
else{
    System.out.println("Computer Win");
}
System.out.println("Computer choise: " + computerOutput);
   }
}
