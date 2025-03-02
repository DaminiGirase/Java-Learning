public class overloding {
    static void friend(){
        System.out.println("You are Good girl");
    }
    static void friend(int a){
        System.out.println("Is " + a + " Good girl ?");
    }

    public static void main(String[] args) {  
        System.out.println("About methode overloading");
        friend();
        friend(200);
    }
}
