import java.io.*;
import java.util.*;


public class Password {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int u = 0, d = 0, l = 0, s = 0;
        int count = 0;
        for(int i=0; i<n; i++) {
            if(!Character.isUpperCase(password.charAt(i)))
                u++;
            else if(!Character.isDigit(password.charAt(i)))
                d++;
            else if(!Character.isLowerCase(password.charAt(i)))
                l++;
            else
                s++;
        }
        if(u==0)
            count++;
        if(d==0)
            count++;
        if(l==0)
            count++;
        if(s==0)
            count++;

        if((n+count)<6)
            count= count+(6-(n+count));
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

