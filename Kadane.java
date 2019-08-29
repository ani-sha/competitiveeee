import java.util.Scanner;

public class Kadane {

    private static final Scanner sc = new Scanner(System.in);

    public static int kadane(int arr[], int n) {
        int brr[] = new int[n];
        brr[0] = arr[0];
        for(int i=1; i<n; i++)
            brr[i] = brr[i-1]+arr[i];

        int sum = brr[n-1];
        int leftsum = 0;
        int rightsum = 0;

        if(sum-brr[0] == 0)
            return 0;
        else if(brr[n-2] == 0)
            return n-1;
        else {
            for (int i = 1; i <= n - 2; i++) {
                leftsum = brr[i - 1];
                rightsum = sum - brr[i];
                if (leftsum == rightsum)
                    return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr [] = new int[n];

        for (int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        int index = kadane(arr,n);
        System.out.print(index);

    }
}
