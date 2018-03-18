import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr) {
        // Complete this function
        double plus = 0, minus = 0, zero = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                plus++;
            } else if(arr[i] < 0) {
                minus++;
            } else {
                zero++;
            }
        }
        System.out.format("%.6f\n", plus / n);
        System.out.format("%.6f\n", (minus / n));
        System.out.format("%.6f\n", zero / n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
