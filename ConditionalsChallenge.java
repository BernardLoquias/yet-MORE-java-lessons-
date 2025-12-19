import java.util.Scanner;

public class ConditionalsChallenge {
    public static void main(String[] args) {

        // Challenge 1: store password, ask user to enter pw, compare them and print access granted or denied
        //Challenge 2: Ask user for #, tell if its even or odd
        //Challenge 3: Ask user for an integer grade (0-100). Print a letter grade A, B, C, D, E, F. Remember to parse the integer.

        //Challenge 1
        Scanner input = new Scanner(System.in); 
        String pw = "Wassuplilbro"; 
        
        System.out.println("Enter password: "); 
        String yourPw = input.nextLine(); 

        if (yourPw == pw) {
            System.out.println("Access granted! Come in lil bro");
        } else {
            System.out.println("Access denied lil vro!"); 

            // challenge 2 
       public class Challenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        scanner.close();
    }
}

       // challenge 3 
        public class Challenge3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade (0-100): ");
        String input = scanner.nextLine();

        int grade = Integer.parseInt(input);

        if (grade >= 90) {
            System.out.println("Grade: A");
        } else if (grade >= 80) {
            System.out.println("Grade: B");
        } else if (grade >= 70) {
            System.out.println("Grade: C");
        } else if (grade >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}


        }

    }
}