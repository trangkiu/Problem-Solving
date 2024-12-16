package ProblemSolving_Easy;

import java.io.IOException;
import java.util.*;
/**
 * @author Trang Nguyen
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class Diagonal_Difference {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int rowAndCol = input.nextInt();
        int[][] matrix = new int[rowAndCol][rowAndCol];

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                matrix[x][y] = input.nextInt();
            }
        }
        int resultPri = 0;
        for (int x = 0; x < matrix.length; x++) {
            resultPri += matrix[x][x];
        }

        int resultSec = 0;
        for (int x = 0; x < matrix.length; x++) {
            resultSec += matrix[x][matrix.length - 1 - x];
        }

        System.out.println(Math.abs(resultPri - resultSec));
    }
}
