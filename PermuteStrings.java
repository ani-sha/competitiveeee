import java.util.Scanner;

public class PermuteStrings {

    private static final Scanner sc = new Scanner(System.in);

    public static String swap(String s, int l, int r) {
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[l] ;
        charArray[l] = charArray[r];
        charArray[r] = temp;
        return String.valueOf(charArray);
    }

    public static void PermuteStrings(String s, int l, int r) {
        if(l==r)
            System.out.println(s);
        else {
            for(int i=l; i<=r; i++) {
                s = swap(s,l,i);
                PermuteStrings(s,l+1,r);
                s = swap(s,l,i);
            }
        }
    }
    public static void main(String[] args) {
        String s = sc.nextLine();
        PermuteStrings(s,0,s.length()-1);
    }
}
