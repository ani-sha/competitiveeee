import java.util.*;
public class JumpSearch {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[]args) {
        int no = sc.nextInt();
        int arr[] = new int[no];
        for (int j = 0; j < no; j++) {
            arr[j] = sc.nextInt();
        }
        int element = sc.nextInt();
        int result = JumpSearch(arr, element);
        if(result == -1)
            System.out.println("Not Found");
        else
            System.out.println("Fount at = "+result);
    }

    static int JumpSearch(int [] arr, int ele) {
        int n = arr.length;
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;
        while(arr[Math.min(step,n)-1] < ele) {
            prev = step;
            step = step + (int)Math.floor(Math.sqrt(n));
            if(prev >= n)
                return -1;
        }
        while (arr[prev] < ele) {
            prev++;
            if(prev == Math.min(step,n))
                return -1;
        }
        if(arr[prev] == ele)
            return prev;
        return -1;
    }
}

