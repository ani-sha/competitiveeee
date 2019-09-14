

import java.io.*;
import java.util.*;

public class Target {

    // Complete the funnyString function below.
    static String funnyString(String s) {
        int len = s.length();
        String rev = "";
        int arr[] = new int[len];
        int rev_arr[] = new int[len];
        for(int i=len-1; i>=0; i--)
            rev = rev + s.charAt(i);
        for(int i=0; i<len-1; i++) {
            arr[i] = Math.abs((int)s.charAt(i) - (int)s.charAt(i+1));
            rev_arr[i] = Math.abs((int)rev.charAt(i) - (int)rev.charAt(i+1));
        }
        if(arr.equals(rev_arr))
            return "Funny";
        else
            return "Not Funny";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
