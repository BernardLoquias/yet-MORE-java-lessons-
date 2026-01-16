public class ArrayPracticeC {
    public static void main(String[] args) {

        // Trace the following code. What is the output?
int array8[][] = {{6,4,3},{4,3,2}};
for(int i=0;i<2;i++)
for(int j=0;j<3;j++)

System.out.print(2*array8[i][j]);

System.out.println();

// 1286864
//it prints this because the nested loops go through each element, multiply it by 2, and print them all in order without spaces, then adds a newline at the end.

        
    }
}
