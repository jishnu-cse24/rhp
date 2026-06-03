import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int n = s.length();

        for (int flag = 1; flag < (1 << n); flag++) {

            String comb = "";

            for (int i = 0; i < n; i++) {
                if ((flag & (1 << i)) > 0) {
                    comb += s.charAt(i);
                }
            }

            System.out.println(comb);
        }
    }
}