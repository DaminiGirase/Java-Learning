class Library1{
    String [] games;
    int no_of_game;
    Library1(){
        this.games = new String[100];
        no_of_game = 0;
    }
    void addGame(String game){
        this.games[no_of_game] = game;
        no_of_game++;
        System.out.println(game + " has been added");
    }
    void availableGame(){
        System.out.println("Available games are: ");
        for(String game : this.games ){
           if(game == null){
            continue;
           } 
           System.out.println("* "+game);
        }
    }
    void issueGame(String game){
        for(int i=0; i<this.games.length; i++){
        if(this.games[i] == game){
            System.out.println("this game has been issued");
            this.games[i] = null;
            return;
        }
        }
        System.out.println("This book does not exists");
    }
    void returnGame(String game){
        this.games[no_of_game] = game;
    }
}

public class libraryGame {
    public static void main(String[] args) {
        Library1 cs = new Library1();
        cs.addGame("Freefire");
        cs.addGame("Pub G");
        cs.addGame("Candi Crush");
        cs.availableGame();
        cs.issueGame("pub G");
        cs.availableGame();
        cs.returnGame("Temple Rum");
        cs.availableGame();
    }
}
