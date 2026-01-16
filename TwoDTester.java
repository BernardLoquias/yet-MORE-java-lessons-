import java.util.Scanner;
public class TwoDTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] nums = new int[3][2];

         for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++) {
                System.out.println("Enter a value for row " + i + " and collumn " + j);
                nums[i][j] = input.nextInt();  
            }
        }
        //print out a 2D array as a grid
        //Use escaped character /t for tab and /n for new line 
        //hint: another for loop goes here! To print the filled/ values of the 2D array
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums[i].length; i++) {
                System.out.print(nums[j][i] + " ");
            } // end for
            System.out.println();
        } // end for

        input.close(); 



    }
}
