import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter hero name: ");
        String name = input.nextLine();

        System.out.println(name + " was taking a stroll across the . \nThen " + name + " heard a scream from a house.  was calling for help!" + "\nAs " + name +  "sprinted to save the person in need, they suddenly he saw a nta. What should he do?");
        
        System.out.println("Please type either A or B");
        System.out.println("Option A: Save the person ");
        System.out.println("Option B: Run away");
        System.out.println("What is your choice? ");

        String Choice1 = input.nextLine();


        boolean playAgain = true;

        while (playAgain) {
            int health = 100;
            System.out.println("Holiday Adventure Begins!");
            System.out.println(name + "'s health: " + health);

            if (Choice1.equalsIgnoreCase("A")) {
                System.out.println(name + " rushes inside the snowy house to help!");
                health -= 20;

                System.out.println("A cold wind chills " + name + ". Health now: " + health);
                System.out.println("Do you:");
                System.out.println("A: Drink hot cocoa");
                System.out.println("B: Keep going");

                String Choice2 = input.nextLine();

                if (Choice2.equalsIgnoreCase("A")) {
                    health += 20;
                    System.out.println("The cocoa warms " + name + "! Health: " + health);
                } else {
                    health -= 30;
                    System.out.println(name + " pushes on and feels weaker. Health: " + health);
                }

                System.out.println("A holiday monster appears!");
                System.out.println("A: Fight it");
                System.out.println("B: Hide behind the Christmas tree");

                String Choice3 = input.nextLine();

                if (Choice3.equalsIgnoreCase("A")) {
                    health -= 40;
                    System.out.println(name + " defeats the monster but gets hurt. Health: " + health);
                } else {
                    System.out.println(name + " hides safely until help arrives!");
                }

            } else {
                System.out.println(name + " runs away into the snow.");
                health -= 50;
                System.out.println("The cold is brutal. Health: " + health);
            }

            if (health > 0) {
                System.out.println(name + " survives the holiday adventure!");
            } else {
                System.out.println(name + " has fallen... the holidays are ruined.");
            }

            System.out.println("\nDo you want to play again? (Y/N)");
            String again = input.nextLine();

            if (again.equalsIgnoreCase("Y")) {
                System.out.println("\nChoose again: A or B");
                Choice1 = input.nextLine();
            } else {
                playAgain = false;
                System.out.println("Thanks for playing, " + name + "! Happy Holidays!");
            }
        }
    }
}
