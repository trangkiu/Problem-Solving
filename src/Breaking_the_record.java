
import java.util.Arrays;
import java.util.Scanner;

/*

 */
public class Breaking_the_record {

    static int[] breakingRecords(int[] scores) {
        int max = scores[0];
        int min = scores[0];

        int counterMax = 0;
        int counterMin = 0;

        for (int x = 1; x < scores.length; x++) {
            if (scores[x] > max) {
                max = scores[x];
                counterMax++;
            }
            if (scores[x] < min) {
                min = scores[x];
                counterMin++;
            }
        }
        int[] result = {counterMax, counterMin};
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] arr = new int[length];

        for (int x = 0; x < length; x++) {
            arr[x] = input.nextInt();
        }

        System.out.println(Arrays.toString(breakingRecords(arr)));

    }
}
