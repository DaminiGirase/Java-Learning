public class WraperClass {
    public static void main(String[] args) {
        int a = 1;
        Integer b = Integer.valueOf(1);  // --> Auotoboxing
         int c = b.intValue();             // --> Aunboxing
         System.out.println(Integer.max(2,4));
         System.out.println(Integer.toBinaryString(23));
    }
}
