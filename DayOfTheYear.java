public class DayOfTheYear {
    public int dayOfYear(String date) {
        String s [] = date.split("-");
        int y = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);
        int d = Integer.parseInt(s[2]);
        boolean res = java.time.Year.of(y).isLeap();

        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int total = 0;
        for(int i=0; i<m-1; i++) {
            total = total + days[i];
        }
        if(((y% 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
            total = total + 1;

        return total + d;
    }
}
