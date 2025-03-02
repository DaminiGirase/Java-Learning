class emploe{
    int id;
    String name;
    public
         void game(){
        System.out.println("My id is "+ id);
        System.out.println("My name is: "+ name);
    }
}
public class OppsStart {
    public static void main(String[] args) {
        emploe info = new emploe();
        emploe imfo = new emploe();
        info.id = 73;
        info.name = "Damini";
        imfo.id = 74;
        imfo.name = "Nikita";

        System.out.println("The id is: "+info.id);
        System.out.println("The name is: "+info.name);
        imfo.game();
    }
}
