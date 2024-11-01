import java.util.*;

public class Main {
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 101;
        arr = new int[201];

        for (int i = 0; i < n; i++) {
            int c = sc.nextInt();
            char op = sc.next().charAt(0);

            switch (op) {
                case 'R': {
                    int end = index + c;

                    for (int j = index; j < end; j++) {
                        arr[j]++;
                    }
                    index = end;
                    break;
                }
                case 'L': {
                    int end = index - c;

                    for (int j = index; j > end; j--) {
                        arr[j]++;
                    }
                    index = end;
                    break;
                }
            }
        }

        int cnt = 0;
        for (int i = 0; i <= 200; i++) {
            if (arr[i] >= 2) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}