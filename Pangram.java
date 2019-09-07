

import java.io.*;
import java.util.*;

public class Pangram {

    // Complete the pangrams function below.
    static String pangrams(String s) {
        int count = 0;
        s = s.toLowerCase();
        for(char ch='a';ch<='z'; ch++) {
            if(s.contains(Character.toString(ch))) {
                count++;
            }
        }

        if (count>=26)
            return  "pangram";
        else
            return"not pangram";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

