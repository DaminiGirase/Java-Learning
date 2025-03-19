  // 01 First methode it take n3 time
  
  // Comment is subArray
  // And the code is for Sum amd Max sum

// public class SubArrays {
//     public static void PrintArray(int numbers[]){
       //int ts = 0;

    //    int Currsum = 0;
    //    int maxSum = Integer.MIN_VALUE;
    //     for(int i=0; i<numbers.length; i++){
    //         int start = i;
    //         for(int j=i; j<numbers.length; j++){
    //             int end = j;
    //             Currsum = 0;
    //             for(int k=start; k<=end; k++){
    //                //System.out.print(numbers[k]+ " ");
    //               Currsum += numbers[k];
    //             }
    //             System.out.println(Currsum);
    //             //ts++;
    //           if(maxSum < Currsum){
    //             maxSum = Currsum;
    //           }
    //         }
    //     }
    //   System.out.println("Max sum is :"+maxSum);
        //System.out.println("Total SubArrays are: "+ ts);
//     }
//     public static void main(String[] args) {
//         int numbers[] = {2,3,4,5,6};
//         PrintArray(numbers);

//     }
// }


// 02 Secon methode consume less time

public class SubArrays {
    public static void printSum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        for(int i=1; i<prefix.length; i++){
          prefix[i] = prefix[i-1] + numbers[i];
        }

        for(int i=0; i<numbers.length; i++){
            int start = i;
            for(int j=0; j<numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum is : "+ maxSum);
    }
public static void main(String[] args) {
    int numbers[] = {1,-2,6,-1,3};
  printSum(numbers);
}
    
}