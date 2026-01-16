public class ArrayPractice7 {
    public static void main(String[] args) {

        System.out.println("Array Tracing #6");
int array7[][]={{3,3,3},{2,2,2}};
for(int i=0;i<3;i++)
array7[1][i]=4;
for(int i=0;i<2;i++)
{
for(int j=0;j<3;j++)
System.out.print(array7[i][j]);
System.out.println();
}

// It prints "333 and 444" because the loop changes all values in the second row to 4, and then the nested loops print the first row unchanged and the second row with all 4s.


    }
}
