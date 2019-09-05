import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.Scanner;

public class MergeArray {
    private static final Scanner sc = new Scanner(System.in);

    public static void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
    }

    public static void main(String[] args) {
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();


        int a[] = new int[s1];
        int b[] = new int[s2];

        for (int i=0; i<s1; i++)
            a[i] = sc.nextInt();

        for (int i=0; i<s2; i++)
            b[i] = sc.nextInt();

        int ai = s1 - 1;
        int bi = s2 - 1;
        int ci = s1 + s2 - 1;
        while(bi >= 0 && ai >= 0) {
            if(a[ai] >= b[bi]) {
                a[ci--] = a[ai--];
            }else {
                a[ci--] = b[bi--];
            }
        }

        while(bi >= 0){
            a[ci--] = b[bi--];
        }

//            for (int i = 0; i < a.length; i++) {
//                for (int j = 0; j < b.length; j++) {
//                    if (a[i] > b[j]) {
//                        int t = a[i];
//                        a[i] = b[j];
//                        b[j] = t;
//                    }
//                }
//            }
//        System.out.println("Elements of List 1 & 2 :");
        for (int i = 0; i < s1; i++)
            System.out.print(a[i] + " ");

        for (int i = 0; i < s2; i++)
            System.out.print(b[i] + " ");
    }
}