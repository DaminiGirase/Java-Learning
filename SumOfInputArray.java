import java.util.Scanner;

public class SumOfInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array Elements: ");
        int i;
        for(i=0; i<n; i++){
             arr[i] = sc.nextInt();
        }
        for(i=0; i<n; i++){
            System.out.println(arr[i]);
       }
        int sum = 0;
        for(i=0; i<n; i++){
           sum += arr[i];
        }
        System.out.println("Sum is: " + sum);
    }
}
