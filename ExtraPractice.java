import java.util.Arrays;

public class ExtraPractice {
    public static void main(String[] args) {
        
        int[] ints = {47, 12, 83, 29, 61};
        
        for (int i = 0; i < ints.length - 1; i++) {
    
            for (int j = 0; j < ints.length - 1 - i; j++) {
                if (ints[j] > ints[j + 1]) {
                    int nums = ints[j];
                    ints[j] = ints[j + 1];
                    ints[j + 1] = nums;
                }
            }
        }        
     
     
        System.out.println("Sorted array: " + Arrays.toString(ints));


    }
}
