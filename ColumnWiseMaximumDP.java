import java.util.*;

public class ColumnWiseMaximumDP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int j = 0; j < c; j++) {
            int max = arr[0][j];

            for(int i = 1; i < r; i++) {
                max = Math.max(max, arr[i][j]);
            }

            System.out.println("Column " + (j + 1) + " Max = " + max);
        }
    }
}