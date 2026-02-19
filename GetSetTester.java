// ENCAPSULATION and Getters and Setters
// Read: https://www.w3schools.com/java/java_encapsulation.asp

import java.util.Scanner;

public class GetSetTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //create a new object for my GetSet class
        GetSet player1 = new GetSet();
        GetSet player2 = new GetSet();

        System.out.println(player1.getUsername()); //displays default username value of null
        player1.setUsername("pineappleghost333"); //sets (or mutates) username to new value
        System.out.println(player1.getUsername()); //displays new username 

        System.out.println(player2.getUsername()); //displays default username value of null
        player2.setUsername("ironmouse6741"); //sets (or mutates) username to new value
        System.out.println(player2.getUsername()); //displays new username 

        // taking in user input
        GetSet player3 = new GetSet();
        System.out.print("Enter a username: ");
        String userInput = input.nextLine();

        player3.setUsername(userInput);

        System.out.println(player3.getUsername()); //displays new username 

        if (player1.getUsername().equals("pineappleghost333")) {
            System.out.println("You are an admin");
        } else {
            System.out.println("Access denied");
        }

        
    }
}

class GetSet{
    //instance variables; attributes; making the instance 'private' enforces ENCAPSULATION
    private String username = "No user name";
    //ADD ID attribute
    //ADD "rank" attribute: (5 ranks of your choice, like N00b, Bruh, Novice, Hacker, Gawd)

    //accesor methods aka GETTERS:
    public String getUsername(){
        return username;
    }
    
    //mutator methods aka SETTERS
    public void setUsername(String newUsername){
        this.username = newUsername;
    }

}

/// CHALLENGES:
//ADD ID attribute
//ADD "rank" attribute: (5 ranks of your choice, like N00b, Bruh, Novice, Hacker, Gawd)

//Create getters and setters (mutator methods) for both.
//Test by printing setters and getters 

// Take in user input for a username, ID, and Rank. 
// Set input data for a new player object.
    
//Create conditional logic to display a person's level based on their rank. 
//For example: if your rank is "Hacker" display "You are one powerful hacker!"

//challenge 1

public class GetSetTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        GetSet player1 = new GetSet();
        GetSet player2 = new GetSet();

        System.out.println("Default Username: " + player1.getUsername());
        System.out.println("Default ID: " + player1.getID());
        System.out.println("Default Rank: " + player1.getRank());
        System.out.println();

        player1.setUsername("pineappleghost333");
        player1.setID(101);
        player1.setRank("Hacker");

        System.out.println("Player 1 Username: " + player1.getUsername());
        System.out.println("Player 1 ID: " + player1.getID());
        System.out.println("Player 1 Rank: " + player1.getRank());
        System.out.println();

        player2.setUsername("ironmouse6741");
        player2.setID(202);
        player2.setRank("Novice");

        System.out.println("Player 2 Username: " + player2.getUsername());
        System.out.println("Player 2 ID: " + player2.getID());
        System.out.println("Player 2 Rank: " + player2.getRank());
        System.out.println();

       //challenge 2

        GetSet player3 = new GetSet();

        System.out.print("Enter a username: ");
        String userInputName = input.nextLine();

        System.out.print("Enter an ID number: ");
        int userInputID = input.nextInt();
        input.nextLine(); 

        System.out.print("Enter a rank (N00b, Bruh, Novice, Hacker, Gawdlike): ");
        String userInputRank = input.nextLine();

        player3.setUsername(userInputName);
        player3.setID(userInputID);
        player3.setRank(userInputRank);

        System.out.println();
        System.out.println("Player 3 Username: " + player3.getUsername());
        System.out.println("Player 3 ID: " + player3.getID());
        System.out.println("Player 3 Rank: " + player3.getRank());
        System.out.println();

        //challenge 3

        if (player3.getRank().equals("N00b")) {
    System.out.println("You are just getting started!");
} 
else if (player3.getRank().equals("Apprentice")) {
    System.out.println("You are learning the ropes!");
}
else if (player3.getRank().equals("Hacker")) {
    System.out.println("You are one powerful hacker!");
}
else if (player3.getRank().equals("Master")) {
    System.out.println("You are a true master of the game!");
}
else {
    System.out.println("Unknown rank. Keep progressing!");
}
