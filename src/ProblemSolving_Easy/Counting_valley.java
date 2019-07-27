package ProblemSolving_Easy;

/*
https://www.hackerrank.com/challenges/counting-valleys/problem

 */
import java.io.*;
import java.util.*;


public class Counting_valley {

    static int countingValleys(int n, String s) {
        int counter = 0;

        int[] str = new int[n];
        // copy to new array U -> 1, D -> -1 to caculate the sum
        for (int x = 0; x < s.length(); x++) {
            if (s.charAt(x) == 'U') {
                str[x] = 1;
            } else {
                str[x] = -1;
            }
        }
        // if sum == 0 mean the hiker go to sea level 
        // if sumPre < 0 mean they go from below level 
        int sum = 0;
        for (int x = 0; x < str.length; x++) {
            int sumPre = sum;
            sum += str[x];
            if (sum == 0 && sumPre < 0) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        String valley = input.next();
        
        System.out.println(countingValleys(length, valley));
    }

}
