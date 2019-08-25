import java.util.Scanner;

public class RandomizedBS {

    private  static  final Scanner sc = new Scanner(System.in);

    public static int getRandom(int l, int h) {
        return (l + (int)(Math.random() % (h-l+1)));
    }

    public static int RandomizedBS(int arr [], int low, int high, int key) {
        if(high>=low) {
            int mid = getRandom(low,high);

            if(arr[mid] == key)
                return mid;
            else if(arr[mid] > key)
                return RandomizedBS(arr,low, mid-1,key);
            else
                return RandomizedBS(arr,mid+1,high,key);
        }
        return -1;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int arr [] = new int [n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();

        int key = sc.nextInt();
        int low = 0;
        int high = n-1;
        int index = RandomizedBS(arr,low,high,key);
        System.out.print(index);
    }
}
