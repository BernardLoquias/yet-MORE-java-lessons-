public class ArrayPracticeC {
    public static void main(String[] args) {

// Trace the following code. What is the output?
int array6[][] = {{2,3,1},{2,2,1},{0,2,3},{1,0,4}};
for(int i=0;i<4;i++)
{

for(int j=0;j<3;j++)

System.out.print(array6[i][j]);
System.out.println();

// 231
// 221
// 023
// 104

// The code was traced by going row by row, printing each element in that row in order using the inner loop, then moving to the next line with the outer loop.

        
    }
}
