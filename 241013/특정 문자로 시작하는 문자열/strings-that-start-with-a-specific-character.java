import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=0, len = 0;
        int n = sc.nextInt();
        String[] str = new String[n];

        for(int i=0; i<n; i++){
            str[i] = sc.next();
        }
        char c = sc.next().charAt(0);
        for(String s : str){
            if(s.charAt(0)==c){
                cnt++;
                len += s.length();
            }
        }
        System.out.printf("%d %.2f", cnt, (double)len/cnt);

    }
}