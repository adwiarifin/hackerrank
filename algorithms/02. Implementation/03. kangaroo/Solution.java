import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        // Complete this function
        String result = "NO";
        int lastDelta = Integer.MAX_VALUE;
        int delta = Integer.MAX_VALUE;
        boolean divergence = false;
        
        int step = 1;
        int twinCounter = 0;
        boolean loop = true;
        while(loop) {
            int x1_calc = x1 + step * v1;
            int x2_calc = x2 + step * v2;
            
            lastDelta = delta;
            delta = Math.abs(x1_calc - x2_calc);
            if(delta > lastDelta) {
                result = "NO";
                loop = false;
            } else if(delta == lastDelta) {
                twinCounter++;
                if(twinCounter > 3) {
                    result = "NO";
                    loop = false;
                }
            } else if(delta < lastDelta){
                twinCounter = 0;
            }
            if (delta == 0) {
                result = "YES";
                loop = false;
            }
            
            step++;
        }
            
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}