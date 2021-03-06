import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the getTotalX function below.
     */
    static int getTotalX(int[] a, int[] b) {
        /*
         * Write your code here.
         */
        // cari faktor array b
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<b.length; i++) {
            Set<Integer> setInternal = new HashSet<Integer>();
            for(int j=1; j<=b[i]; j++) {
                if(b[i] % j == 0) {
                    setInternal.add(j);
                }
            }
            if(set.isEmpty()) {
                set.addAll(setInternal);
            } else {
                set.retainAll(setInternal);
            }
        }
        
        // dari masing-masing faktor b, adakah faktor dari a?
        int count = 0;
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext()) {
            int value = itr.next().intValue();
            boolean flag = true;
            for(int i=0; i<a.length; i++) {
                if(value % a[i] != 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                count++;
            }
        }
        
        return count;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scan.nextLine().split(" ");

        int n = Integer.parseInt(nm[0].trim());

        int m = Integer.parseInt(nm[1].trim());

        int[] a = new int[n];

        String[] aItems = scan.nextLine().split(" ");

        for (int aItr = 0; aItr < n; aItr++) {
            int aItem = Integer.parseInt(aItems[aItr].trim());
            a[aItr] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scan.nextLine().split(" ");

        for (int bItr = 0; bItr < m; bItr++) {
            int bItem = Integer.parseInt(bItems[bItr].trim());
            b[bItr] = bItem;
        }

        int total = getTotalX(a, b);

        bw.write(String.valueOf(total));
        bw.newLine();

        bw.close();
    }
}
