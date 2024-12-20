import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] A = new int[n1];
        int[] B = new int[n2];

        for (int i = 0; i < n1; i++) {
            A[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n2; i++) {
            B[i] = sc.nextInt();
        }
        
        boolean re = isContain(A, B);
        if (re) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

    public static boolean isContain(int[] A, int[] B) {
        int s1 = A.length, s2 = B.length;

        for (int i = 0; i <= s1 - s2; i++) {
            boolean temp = true;
            for (int j = 0; j < s2; j++) {
                if (A[i + j] != B[j]) {
                    temp = false;
                    break;
                }
            }
            if (temp) {
                return true; // 부분 배열이 일치하면 true 반환
            }
        }
        return false; // 부분 배열이 없는 경우 false 반환
    }
}