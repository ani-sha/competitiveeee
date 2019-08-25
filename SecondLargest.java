import java.util.Scanner;

public class SecondLargest {

    private static final Scanner sc = new Scanner(System.in);

    public static int secondLargest(int[] a, int n) {
        int i, one = Integer.MIN_VALUE, two = Integer.MIN_VALUE;
        if(n<2)
            return -1;

        for(i=0; i<n; i++) {
            if(a[i]>one) {
                two = one;
                one = a[i];
            }
            else if(a[i]>two && a[i]!=one)
                two = a[i];
        }
        if(two == Integer.MIN_VALUE)
            return -1;
        else
            return two;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();

        int max = secondLargest(arr,n);
        System.out.print(max);
    }
}
