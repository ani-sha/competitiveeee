import java.util.*;
public class SelectionSort {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[]args) {
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        SelectionSort(arr);
    }

    static void SelectionSort(int[]arr) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
            int pos = i;
            for(int j=i+1; j<n; j++) {
                if(arr[pos] > arr[j])
                    pos = j;
            }
            int temp = arr[pos];
            arr[pos] = arr[i];
            arr[i] = temp;
        }
        for(int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
