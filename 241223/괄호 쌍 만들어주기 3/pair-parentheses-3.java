import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wd = sc.next();
        char[] Arr = wd.toCharArray();
        int cnt = 0, len = Arr.length;
        
        for(int i=0; i<len-1; i++){
            if(Arr[i] == '('){
                for(int j=i+1; j<len; j++){
                    if(Arr[j]==')'){
                        cnt++;
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}