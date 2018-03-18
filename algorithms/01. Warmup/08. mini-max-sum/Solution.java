import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        // Complete this function
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        int n = 5;
        for(int i = 0; i < n; i++) {
            long sum = 0;
            for(int j = 0; j < n; j++) {
                if(i != j) {
                    sum += arr[j];
                }
            }
            max = Math.max(max, sum);
            min = Math.min(min, sum);
        }
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
