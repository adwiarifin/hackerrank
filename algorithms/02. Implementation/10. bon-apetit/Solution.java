import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static String solve(int n, int k, int[] ar, int b) {
        int sum = 0;
        for(int i=0; i<n; i++) {
            if(i != k) {
                sum += ar[i];
            }
        }
        
        String result = "";
        int b2 = b - sum / 2;
        if(b2 != 0) {
            result = "" + b2;
        } else {
            result = "Bon Appetit";
        }
        
        return result;
    }
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++) {
            ar[i] = in.nextInt();
        }
        int b = in.nextInt();
        
        String result = solve(n,k,ar,b);
        System.out.println(result);
    }
}
