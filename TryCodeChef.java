public class TryCodeChef {
    public static void main(String[] args) {
        int i = 1;  // Start from 0 to get 2^0 = 1, then we print 2^i in each iteration
        while ((1 << i) <= 128) {  // Use left shift to calculate 2^i
            System.out.println(1 << i);  // Prints 2^i
            i++;
        }
    }
}
