// Problem : https://www.hackerrank.com/challenges/30-2d-arrays/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum;
        
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        sum = arr[0][0] + arr[0][1] + arr[0][2] + arr[1][1]
            + arr[2][0] + arr[2][1] + arr[2][2];
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                sum = Math.max(sum, arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1]
                    + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
            }
        }
        System.out.println(sum);
    }
}