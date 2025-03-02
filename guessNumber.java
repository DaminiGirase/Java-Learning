import java.util.Scanner;
import java.util.Random;
class game{
  private int randomNumber;
  private int userInput;
  public int getrandomNumber(){
    return randomNumber;
  }
  public int getuserInputr(){
    return userInput;
 }
}
public class guessNumber {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    int userInput = sc.nextInt();
    Random cs = new Random();
    int randomNumber = cs.nextInt(100);

    System.out.println("Enter your number: "+userInput);
   
   if(randomNumber == userInput){
    System.out.println("You guess it Rigth!");
   }
   else if(randomNumber<userInput){
    System.out.println("You chose grater N umber");
   }
   else if(randomNumber>userInput){
    System.out.println("You chose smaller Number");
   }
   else{
    System.out.println("invalid number!");
 
}
   System.out.println("Computer choses: "+randomNumber);
  
  }  
}
