public class methodePractice {

    // practice problem 1

    // static void table(int n){
    //    for(int i=1; i<=10; i++){
    //     System.out.println(n*i);
    //    }
    //     }
    
    // public static void main(String[] args) {
    //     System.out.println("Table of two is: ");
    //     int n = 2;
    //     table(n);
    // }

    // Practice problem 2

//  static void pattern(int n){
//     for(int i=1; i<=n; i++){
//         for(int j=1; j<=i; j++){
//             System.out.printf("* ");
//         }
//         System.out.printf("\n");
//     }
//  }
//     public static void main(String[] args) {
//         int n= 5;
//         pattern(n);
//     }

// Practice problem 3

//     static void sum(int n){
//     int sum1 = 0;
//     for(int i=1; i<=n; i++){
//         sum1 += i;
//     }
//     System.out.println(sum1);
// }
// public static void main(String[] args) {
//     System.out.println("The sum of n natural numbers:");
//     int n = 6;
//     sum(n);
// }

// Practice problem 4

// static void pattern(int n){
//     for(int i=n; i>=1; i--){
//         for(int j=1; j<=i; j++){
//             System.out.printf("* ");
//         }
//         System.out.printf("\n");
//     }
// }
// public static void main(String[] args) {
//     System.out.println("Pattern is: ");
//     int n = 5;
//     pattern(n);
// }

// Practice problem 5

// static void fibonachi(int n){
//     int first = 0, second = 1, next;
//     for(int i=1; i<=n; i++){
//         if(i==1){
//             System.out.printf("%d ",first);
//         }
//         else if(i==2){
//              System.out.printf("%d ",second);
//         }
//         else{
//             next = first + second;
//             System.out.printf("%d ",next);
//             first = second;
//             second = next;
//         }
//     }
// }
// public static void main(String[] args) {
//     System.out.println("The fibonachi series is: ");
//     int n = 8;
//     fibonachi(n);
// }

// Practice problem 6

static void average(int ...arr){
    int sum = 0;
    for(int e: arr){
        sum += e;
    }
    int average1 = sum/arr.length;
    System.out.println(average1);
}
public static void main(String[] args) {
    System.out.println("The Average of variables are: ");
    average(98, 97, 99, 95, 94);
}
}
// Practice problem 7

// static void pattern_rec(int n){
//     if(n>0){
//         pattern_rec(n-1);
//         for(int i=0; i<n; i++){
//             System.out.printf("* ");
//         }
//         System.out.println();
//     }
// }
// public static void main(String[] args) {
//     int n = 5;
//     pattern_rec(n);
// }

// Practice Problem 8

// static void farenfite(int cel){
//     int far = (cel * 9/5) + 32;
//     System.out.println(far);
// }
// public static void main(String[] args) {
//     System.out.println("Convert celcius to farenhite: ");
//     System.out.print("Temperature in farenhite is: ");
//     farenfite(50);
// }
// }
