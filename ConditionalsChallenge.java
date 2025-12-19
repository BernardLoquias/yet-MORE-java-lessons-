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
        }

    }
}