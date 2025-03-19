public class reverseInArray {
    public static void swap(int numbers[]){
        int first = 0, last = numbers.length-1;
        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int number[] = {23,34,45,56,67};
        swap(number);
        for(int i=0; i<number.length; i++){
            System.out.println(number[i]+ " ");
        }
      System.out.println();
    }
}
