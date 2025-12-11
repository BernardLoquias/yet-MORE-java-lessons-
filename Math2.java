// lesson on accumilation and increment, decrement 

class Scoreboard {
    
    static String gameName = "Kwool Game"; 

    int playerXP =  0; 
    int playerLevel = 0; 
    int playerHealth = 1000; 
    String playerName;

    public Scoreboard(String user) {
        playerName = user;
    }

    void gainXP(int amount ) {
        playerXP = playerXP + amount; //accumilation, long way of doing it

    }

    void heal() {
        playerHealth += 50; //compound addition, compound accumilation 

    }

    void damage() {
        playerHealth -= 10; //compound subtraction

    }

    void levelUp() {
        playerLevel ++; // increment 

    }

    void levelDown() {
        playerLevel --; // decrement  

    }

    static void gameName() {
        System.out.println("Game Name: " + gameName);
    
    }

    void gainHealth(int amount) {
        playerHealth = playerHealth + amount; 
    
    } 


}

public class Math2 {
    public static void main(String[] args) {
 
        Scoreboard player1 = new Scoreboard(); 
        Scoreboard player2 = new Scoreboard(); 

        player1.gainXP(100); 
        player1.gainXP(200); 
        player1.heal();
        player1.damage();
        player1.levelUp(); 
        player1.levelUp();
        player1.levelDown();

        player1.gainHealth(5); 

        player2.gainXP(600); 
        player2.gainXP(700); 
        player2.heal();
        player2.damage();
        player2.levelUp(); 
        player2.levelUp();
        player2.levelDown();

        player2.gainHealth(5); 


        Scoreboard.gameName();

        System.out.println("Player XP: " + player1.playerXP); 
        System.out.println("Player Level: " + player1.playerLevel); 

        System.out.println("Player XP: " + player2.playerXP); 
        System.out.println("Player Level: " + player2.playerLevel);

    }
}
