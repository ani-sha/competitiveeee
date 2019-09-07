import java.util.*;
public class InterpolationSearch {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[]args) {
        int no = sc.nextInt();
        int arr[] = new int[no];
        for (int j = 0; j < no; j++) {
            arr[j] = sc.nextInt();
        }
        int element = sc.nextInt();
        int result = InterpolationSearch(arr, element);
        if(result == -1)
            System.out.println("Not Found");
        else
            System.out.println("Fount at = "+result);
    }

    static int InterpolationSearch(int [] arr, int ele) {
        int n = arr.length;
        int l =0;
        int h = n-1;

        while(l<=h && ele >= arr[l] && ele <= arr[h]) {
            if (l == h) {
                if (arr[l] == ele)
                    return l;
                return -1;
            }
            int pos;
            pos = (int) (l + (((double) (h - l) / (arr[h] - arr[l])) * (ele - arr[l])));

            if(arr[pos] == ele)
                return pos;
            if(arr[pos] < ele)
                l = pos + 1;
            else
                h = pos - 1;
        }
        return -1;
    }
}
