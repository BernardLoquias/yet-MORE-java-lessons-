import java.util.Random;
import java.util.Scanner;

public class Loops {
   public static void main(String[] args) {

       for (int i = 0; i < 5; i += 1) {
           for (int j = 0; j < 5; j++) {
              
                   System.out.print(j);
           }
           System.out.print('\n');
       }


       int i = 0;
       while (i < 5) {
           System.out.println(i);
           i++;
      
       }


       boolean isContinuing = true;
       int z = 0;
      
       while (isContinuing) {
           z++;
           if (z == 20) {
               isContinuing = false;
           }
           System.out.println(z);
       }

    // challenge 1
       for (int x = 1; x <= 100; x++) {
           if (x % 3 == 0 && x % 5 == 0) {
               System.out.println("foobar");
           } else if (x % 3 == 0) {
               System.out.println("foo");
           } else if (x % 5 == 0) {
               System.out.println("bar");
           } else {
               System.out.println(x);
           }
       }

       // challenge 2
       public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {        
            for (int j = 1; j <= 12; j++) {    
                System.out.print(i * j + "\t");
            }
            System.out.println(); 
        }
    }
}

        // challenge 3
        public class GuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int answer = random.nextInt(3) + 1; 
        int guess = 0;

        while (guess != answer) {
            System.out.print("Guess a number between 1 and 3: ");
            guess = scanner.nextInt();

            if (guess == answer) {
                System.out.println("Correct answer! 🎉");
            } else {
                System.out.println("Wrong answer, try again.");
            }
        }

        scanner.close();
    }
}
       

   }
}



