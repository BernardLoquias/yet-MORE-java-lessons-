public class ArrayPractice1 {
    public static void main(String[] args) {

        int[] price = new int[10];

        int[] number = new int[20];

        for (int i = 0; i < number.length; i++) {
            number[i] = 4;
        }

        java.util.Arrays.sort(number);

        double median;
        int middle = number.length / 2;

        if (number.length % 2 == 0) {
            median = (number[middle - 1] + number[middle]) / 2.0;
        } else {
            median = number[middle];
        }

        System.out.println("Median: " + median);


        
    }
}