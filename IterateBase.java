import java.util.*;

public class IterateBase {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] ab = sc.nextLine().split(" ");
        int finRes = findNo(ab[0]);
        System.out.print(finRes);
    }

    static int findNo(String ch) {
        int res = 0;
        int no = Integer.parseInt(ch);

        if (ch.matches("\\-?\\d+")) {
            int i = 0;
            int arr[] = new int[ch.length()];
            while (no > 0) {
                arr[i++] = no % 10;
                no = no / 10;
            }

            int base = arr[0];
            for (int j = 1; j < arr.length-1; j++)
                if (arr[j] > base)
                    base = arr[j];
            res = toDeci(ch, base+1);
        }

        else {
            int len = ch.length();
            int new_arr[] = new int[len];
            for(int p=0; p<len; p++) {
                new_arr[p] =  ch.charAt(p) - 56;
            }
            int new_base = new_arr[0];
            for (int j = 1; j < new_arr.length-1; j++)
                if (new_arr[j] > new_base)
                    new_base = new_arr[j];

            String new_string = new_arr.toString();
            res = toDeci(new_string,new_base+1);

        }

        int old_no = Integer.parseInt(ch);
        if(res == old_no)
            return res;
        else if(res == 2 || res == 3)
            return res;
        else if(res > 3) {
            String new_val = String.valueOf(res);
            int new_res = findNo(new_val);
            return new_res;
        }

        return res;
    }


    static int val(char c)
    {
        if (c >= '0' && c <= '9')
            return (int)c - '0';
        else
            return (int)c - 'A' + 10;
    }

    static int toDeci(String str, int base) {
        int len = str.length();
        int power = 1;

        int num = 0;
        int i;


        for (i = len - 1; i >= 0; i--) {
            num += val(str.charAt(i)) * power;
            power = power * base;
        }

        return num;
    }

}
