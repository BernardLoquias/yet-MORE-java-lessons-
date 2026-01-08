import java.util.Scanner;

public class ComputeAvg {
    public static void main(String[] args) {

        int avg = 0;
        Scanner score = new Scanner(System.in);
        int[] scores = {score.nextInt(), score.nextInt(), score.nextInt(), score.nextInt(), score.nextInt()};
        for (int scr : scores) {
            avg += scr;
        }
        avg = avg / scores.length;
        System.out.println(avg);c

    }
}
