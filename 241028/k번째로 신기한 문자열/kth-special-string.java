import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int len;
    public static String T;

    public static void main(String[] args) {
        int n = sc.nextInt(), k = sc.nextInt();
        T = sc.next();
        len = T.length();
        
        String[] str = new String[n];
        inWord(str, k);
    }

    public static void inWord(String[] s, int k){
        int cnt = 0;

        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();
            String temp = s[i].substring(0, len);
            if (temp.equals(T)) {
                cnt++;
            }
        }

        System.out.print(findOption(cnt, s, k));
    }

    public static String findOption(int cnt, String[] s, int k) {
        String[] arr = new String[cnt];
        int index = 0;

        for (int i = 0; i < s.length; i++) {
            String temp1 = s[i].substring(0, len);
            if (temp1.equals(T)) {
                arr[index++] = s[i];
            }
        }

        Arrays.sort(arr);
        return arr[k-1];
    }
}