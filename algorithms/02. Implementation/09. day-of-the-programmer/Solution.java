import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String solve(int year){
        String result = "";
        if(year < 1918) {
            if(isLeapJulian(year)) {
                result = "12.09";
            } else {
                result = "13.09";;
            }
        } else if(year == 1918) {
            result = "26.09";
        } else {
            if(isLeapGregorian(year)) {
                result = "12.09";
            } else {
                result = "13.09";;
            }
        }
        
        return (result + "." + year);
    }
    
    static boolean isLeapJulian(int year) {
        if(year % 4 == 0) {
            return true;
        }
        return false;
    }
    
    static boolean isLeapGregorian(int year) {
        if(year % 400 == 0) {
            return true;
        } else if(year % 100 == 0) {
            return false;
        } else if(year % 4 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
