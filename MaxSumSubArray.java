import java.util.Scanner;

public class MaxSumSubArray {
    private static final Scanner sc = new Scanner(System.in);

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static int MaxSumSubArray(int[] arr, int n) {
        int brr [] = new int[n];
        brr[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--) {
            brr[i] = max(arr[i]+brr[i+1],arr[i]);
        }

        int max_brr = Integer.MIN_VALUE;
        for(int k : brr)
            if(k > max_brr)
                max_brr = k;

        return max_brr;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();

        int omax = MaxSumSubArray(arr,n);
        System.out.print(omax);
    }
}
