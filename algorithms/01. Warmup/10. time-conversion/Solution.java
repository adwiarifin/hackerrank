import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        // Complete this function
        String ampm = s.substring(s.length() - 2);
        String result = "";
        if(s.substring(0,2).equals("12")){
            if(ampm.equals("AM")) {
                result = "00" + s.substring(2, s.length() - 2);;
            } else {
                result = "12" + s.substring(2, s.length() - 2);
            }
        } else if(ampm.equals("AM")) {
            result = s.substring(0, s.length() - 2);
        } else {
            int hours = (Integer.parseInt(s.substring(0,2))+12);
            result = hours + s.substring(2, s.length() - 2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
