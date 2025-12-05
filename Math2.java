// lesson on accumilation and increment, decrement 

class Scoreboard {
    
    static String gameName = "Kwool Game"; 

    int playerXP =  0; 
    int playerLevel = 0; 

    void gainXP(int amount ) {
        playerXP = playerXP + amount; //accumilation, long way of doing it

    }

    void heal() {
        playerXP += 50; //compound addition, compound accumilation 

    }

    void damage() {
        playerXP -= 10; //compound subtraction

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

        player2.gainXP(600); 
        player2.gainXP(700); 
        player2.heal();
        player2.damage();
        player2.levelUp(); 
        player2.levelUp();
        player2.levelDown();
        


        Scoreboard.gameName();

        System.out.println("Player XP: " + player1.playerXP); 
        System.out.println("Player Level: " + player1.playerLevel); 

        System.out.println("Player XP: " + player2.playerXP); 
        System.out.println("Player Level: " + player2.playerLevel);

    }
}
