package ProblemSolving_Easy;

import java.io.IOException;
import java.util.*;

/**
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 *
 * @author Trang Nguyen
 */
public class Sock_Merchant {

    static int sockMerchant(int n, int[] ar) {
        int pair = 0;
        Arrays.sort(ar);                
        for (int x = 0; x < n; x++) {
            if (x == n - 1) {
                break;
            }
            if (ar[x] == ar[x + 1]) {
                pair++;
                x += 1;
            }
        }

        return pair;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(sockMerchant(length, arr));
    }
}
