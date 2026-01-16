public class ArrayPractice5 {
    public static void main(String[] args) {

        System.out.println("Array Tracing #4");
int array4[][] = new int[2][3];
for(int i=0;i<2;i++)
for(int j=0;j<3;j++)
{
array4[i][j]=i+3*j;
System.out.print(array4[i][j] + " ");
}
System.out.println();

// It prints "0,3,6,1,4,7" because each element is calculated as i + 3*j, so the values increase by 3 as j increases and then continue when i changes.


    }
}
