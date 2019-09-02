import java.io.*;
import java.util.*;


public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String str1, String str2) {
        Set set1 = new HashSet(Arrays.asList(str1.split("")));
        Set set2 = new HashSet(Arrays.asList(str2.split("")));

        Set set3 = new HashSet(set1);
        set3.addAll(set2);
        return set3.size() == set1.size() + set2.size() ? "NO" : "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

