public class Multi {
  public static void main(String[] args) {
    System.out.println("Program to print two diamentional array");
    int [][] flats;
    flats = new int [2][2];
    flats[0][0] = 101;
    flats[0][1] = 102;
    flats[1][0] = 103;
    flats[1][1] = 104;
    for(int i=0; i<flats.length; i++){
        for(int j=0; j<flats[i].length; j++){
            System.out.print(flats[i][j]);
            System.out.print(" ");

        }
        System.out.printf("\n");
    }
   
    
  }
}
