package ProblemSolving_Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Roman_to_Integer {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(romanToInt(input));

    }

    public static int romanToInt(String s) {
        int sum = 0;
        int prev = 0;
        int num = 0;
        for(int i = 0; i < s.length(); i++){
            prev = num;
            num = dictionary(s.charAt(i));

            if(prev < num){
                sum -= prev * 2;
            }
            sum += num;

        }
        return sum;
    }
    public static int dictionary(char c){
        switch(c){
            case ('I'):
                return 1;
            case ('V'):
                return 5;
            case ('X'):
                return 10;
            case ('L'):
                return 50;
            case('C'):
                return 100;
            case ('D'):
                return 500;
            case ('M'):
                return 1000;
            default:
                return 0;
        }
    }
}
