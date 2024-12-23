import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wd = sc.next();
        int cnt = 0, len = wd.length();

        for(int i=0; i<len-3; i++){
            char c1 = wd.charAt(i);
            char c2 = wd.charAt(i+1);
            if(c1 == '(' && c2 == '('){
                for(int j=i+2; j<len-1; j++){
                    char c3 = wd.charAt(j);
                    char c4 = wd.charAt(j+1);
                    if(c3==')' && c4==')'){
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}