// Buffer Class

// import java.io.InputStreamReader;
// import java.io.BufferedReader;
// import java.io.IOException;

// public class DifferantTypesOfInput {
//     public static void main(String[] args)throws Exception {
//         InputStreamReader sc = new InputStreamReader(System.in);
//         BufferedReader cs = new BufferedReader(sc);
//       String n = cs.readLine();
//        System.out.println("The Input is: "+ n);
//     }
// }

// Console Class

import java.io.Console;
public class DifferantTypesOfInput {
public static void main(String[] args) {
    Console sc = System.console();
    System.out.println("Enter UserName: ");
    String str = sc.readLine();
    System.out.println("UserName is:" + str);
    System.out.println("Enter PassWord: ");
    char ch[];
    ch = sc.readPassword();
    System.out.println("PassWord is: " + ch);

}
    
}
