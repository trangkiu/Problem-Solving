package ProblemSolving_Easy;


import java.util.*;

/*
https://www.hackerrank.com/challenges/the-birthday-bar/problem?h_r=next-challenge&h_v=zen
 */
public class Birthday_chocolate {

    static int birthday(List<Integer> s, int summing, int squares) {
        int count = 0;
                
        for (int i = 0; i <= s.size() - squares; i++) {
            int sum = 0;
            int x = i;

            for (int j = 1; j <= squares; j++) {
                sum += s.get(x);
                x++;

            }

            if (sum == summing) {
                count++;

            }

        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            arr.add(input.nextInt());
        }

        int summing = input.nextInt();
        int squares = input.nextInt();

        System.out.println(birthday(arr, summing, squares));

    }
}
