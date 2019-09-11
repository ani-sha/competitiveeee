import java.util.*;
public class SmartNo {

    private static final Scanner sc = new Scanner(System.in);

    static boolean isSmartNo(int num) {
        int count = 0;
        for (int i=1; i<=num; i++) {
            if(num%i == 0)
                count++;
        }
        if(count%2 == 0)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            boolean ans = isSmartNo(num);
            if(ans)
                System.out.print("YES");
            else
                System.out.print("NO");
        }
    }
}
