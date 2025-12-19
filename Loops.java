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

       

   }
}



