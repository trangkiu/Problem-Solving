package ProblemSolving_Medium.String;

import java.util.Scanner;

/*
https://neetcode.io/problems/valid-sudoku
 */
public class ValidSudoku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        char[][] board = {
                {'1','2','.','.','3','.','.','.','.'},
                {'4','.','.','5','.','.','.','.','.'},
                {'.','9','8','.','.','.','.','.','3'},
                {'5','.','.','.','6','.','.','.','4'},
                {'.','.','.','8','.','3','.','.','5'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','.','.','.','.','.','2','.','.'},
                {'.','.','.','4','1','9','.','.','8'},
                {'.','.','.','.','8','.','.','7','9'}
        };


        System.out.println(isValidSudoku(board));

    }

    public static boolean isValidSudoku(char[][] board){
        // check row

        for(int i = 0; i < board.length; i++){ // b[0,1] , b[

            for(int j = 0; j < board[i].length ; j++){

            }
        }

        // check column
        return true;
    }
}