public class reverseArr{
  public static void main(String[] args) {
    System.out.println("Program to reverse array");
    int [] marks = {98, 97, 96, 95, 99};
    int l = marks.length;
    int n = Math.floorDiv(l,2);
    for(int i = 0; i<n; i++){
      int temp = marks[i];
      marks[i] = marks[l-i-1];
      marks[l-i-1] = temp;
      
    }
    for(int element: marks){
        System.out.println(element);
    }
  }
}