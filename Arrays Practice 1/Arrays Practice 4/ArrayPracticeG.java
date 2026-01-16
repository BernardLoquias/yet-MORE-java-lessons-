public class ArrayPracticeC {
    public static void main(String[] args) {

// Trace the following code. What is the output?
int array7[][] = {{2,2,2},{2,2,0}};
for(int i=0;i<2;i++)
for(int j=0;j<3;j++)
if(array7[i][j]==0&&j==2)
System.out.print(array7[i][j]);
System.out.println();

// It prints 0 because the only element that is both 0 and in column 2 is array7[1][2].

        
    }
}