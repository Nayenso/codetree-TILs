import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[3];
        int[] len = new int[3];
        for(int i=0; i<3; i++){
            str[i] = sc.next();
            len[i] = str[i].length();
        }
        Arrays.sort(len);
        System.out.print(len[2]-len[0]);
    }
}