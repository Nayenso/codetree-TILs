import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), cnt = 0;
        String A = sc.next();

        for(int i=0; i<n; i++){
            String temp = sc.next();
            if(A.equals(temp)){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}