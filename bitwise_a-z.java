import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int flag = 0;

        for (int i = 0; i < s.length(); i++) {
            flag |= (1 << (s.charAt(i) - 'a'));
        }

        if (flag == (1 << 26) - 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}