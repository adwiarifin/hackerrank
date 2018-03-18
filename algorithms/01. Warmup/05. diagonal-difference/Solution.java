import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a) {
        // Complete this function
        int sum1 = 0, sum2 = 0;
        for(int i = 0, c = a.length; i < c; i++) {
            sum1 += a[i][i];
            sum2 += a[c-i-1][i];
        }
        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}