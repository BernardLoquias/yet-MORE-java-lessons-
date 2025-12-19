import java.util.Scanner; 

// public class UserInput {
//     public static void main(String[] args) {

//     Scanner input = new Scanner(System.in);
    
//     System.out.println("Enter your name: "); 
//     String name = input.nextLine(); 
//     System.out.println(name); 

//     System.out.println("Enter your name: "); 
//     String age = input.nextLine();
    
//     int ageConverted = Integer.parseInt(age); // parse is how we change our string to an integer
//     System.out.println("Next year  " + name + "will be: " + (ageConverted + 1)); 

//     System.out.println("What is your height in meters?"); 
//     double height = Double.parseDouble(input.nextLine()); 
//     System.out.println("You are " + height + "meters tall"); 

//     }
// }

// challonge (a success)

// public class EmailInput {
//     public static void main(String[] args) {

//     Scanner input = new Scanner(System.in); 

//     System.out.println("Enter 2 words & 2 numbers to create an awesome email: "); 
//     String wordOne = input.nextLine(); 
//     String wordTwo = input.nextLine(); 
//     String numberOne = input.nextLine();
//     String numberTwo = input.nextLine(); 

//     System.out.println("Your email: " + wordOne + wordTwo + numberOne + numberTwo + "@gmail.com"); 

//     }
// }

public class NumberInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); 

        System.out.println("Enter two numbers: "); 
        int numberOne = input.nextLine(); 
        int numberTwo = input.nextLine(); 

        double numberOne = Double.parseDouble(input.nextLine());
        double numberTwo = Double.parseDouble(input.nextLine()); 

        System.out.println(numberOne + "divided by " + numberTwo + "equals: " + (numberOne / numberTwo)); 

    }
}

