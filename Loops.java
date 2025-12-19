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



