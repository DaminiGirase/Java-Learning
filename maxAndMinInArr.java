public class maxAndMinInArr {
    public static void main(String[] args) {
        System.out.println("Program to find maximum and minimun from arr");
        int [] good = {23, 45, 56, 67, 78, 98, 43};
        int max  = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<good.length; i++){
            if(good[i]>max){
                max = good[i];
            }
            if(good[i]<min){
                min = good[i];
            }
        }
        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum value is: " + min);

    }
}
