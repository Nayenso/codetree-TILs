import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean flag = count(str);

        if(flag){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static boolean count(String temp){
        int[] alpha = new int[26];
        int cnt = 0;

        for(int i=0; i<temp.length(); i++){
            alpha[temp.charAt(i)-'a']++;
        }

        for(int i:alpha){
            if(i>=1){
                cnt++;
            }
        }
        if(cnt>=2){
            return true;
        }
        return false;
    }
}