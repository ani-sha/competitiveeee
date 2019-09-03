import java.util.Scanner;


public class QuickSort {

    private static final Scanner sc = new Scanner(System.in);

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for (int j=low;j<high;j++) {
            if(arr[j]<=pivot) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = t;

        return i+1;
    }

    void sort(int arr[], int low, int high) {
        if(low<high) {
            int pi = partition(arr,low,high);

            sort(arr,low,pi-1);
            sort(arr,pi+1,high);
        }
    }

    public static void main(String[] args) {
        QuickSort q = new QuickSort();
        int n = sc.nextInt();
        int arr[] = new int[n];
        q.sort(arr,0,n-1);
    }
}
