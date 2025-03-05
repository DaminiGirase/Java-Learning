import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class DifferantTypesOfInput {
    public static void main(String[] args)throws Exception {
        InputStreamReader sc = new InputStreamReader(System.in);
        BufferedReader cs = new BufferedReader(sc);
      String n = cs.readLine();
       System.out.println("The Input is: "+ n);
    }
}
