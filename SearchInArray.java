public class SearchInArray {
    public static int Search(String name[], String key){
     for(int i=0; i<=name.length; i++){
        if(name[i] == key){
            return i;
        }
     }
     return -1;
    }

    public static void main(String[] args) {
        
        String name[] = {"Damini", "Sita", "Radha", "Parvati"};
        String key = "Damini";
        int idx = Search(name, key);
        if(idx == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Index is :"+ idx);
        }
    }
}
