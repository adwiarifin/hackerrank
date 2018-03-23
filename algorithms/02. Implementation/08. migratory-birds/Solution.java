import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        HashSet<Integer> set = new HashSet<Integer>();
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> count = new ArrayList<>();
        int index = 0;
        for(int i=0; i<n; i++) {
            if(!set.contains(ar[i])) {
                set.add(ar[i]);
                number.add(ar[i]);
                count.add(1);
            } else {
                index = getNumberIndex(ar[i], number);
                count.set(index, count.get(index) + 1);
            }
        }
        
        int max = 0;
        int bird = 0;
        for(int i=0; i<count.size(); i++) {
            if(max < count.get(i).intValue()) {
                max = count.get(i).intValue();
                bird = number.get(i).intValue();
            } else if(max == count.get(i).intValue()) {
                if(bird > number.get(i).intValue()) {
                    bird = number.get(i).intValue();
                }
            }
        }
        
        return bird;
    }
    
    static int getNumberIndex(int val, ArrayList<Integer> number) {
        for(Integer x : number) {
            if(x.intValue() == val) {
                return number.indexOf(x);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
