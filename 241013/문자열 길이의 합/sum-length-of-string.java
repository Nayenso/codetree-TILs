import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalLen = 0, aCnt = 0;
        String[] str = new String[n];

        for(int i=0; i<n; i++){
            str[i] = sc.next();
            totalLen+=str[i].length();
        }
        for(String s : str){
            if(s.charAt(0)=='a'){
                aCnt++;
            }
        }
        System.out.printf("%d %d",totalLen,aCnt);
    }
}