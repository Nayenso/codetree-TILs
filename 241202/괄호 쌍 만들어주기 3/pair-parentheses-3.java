import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int cnt = 0;
        String str = sc.next();
        char[] arr = str.toCharArray();
        int len = str.length();

        for(int i=0; i<len-1; i++){
            if(arr[i]==')'){
                continue;
            }
            for(int j=i+1; j<len; j++){
                if(arr[j]==')'){
                    cnt++;
                }
            }
        }
        System.out.print(cnt);
    }
}