import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        boolean flag = false;
        int cnt = 0;

        for(int i=0; i<A.length(); i++){
            A = A.substring(A.length()-1)+A.substring(0,A.length()-1);
            cnt++;
            if(A.equals(B)){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.print(cnt);
        }else{
            System.out.print(-1);
        }
    }
}