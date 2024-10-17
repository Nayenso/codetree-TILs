import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        String num = Integer.toString(n1+n2);
        int cnt = 0;

        for(int i=0; i<num.length(); i++){
            if(num.charAt(i)=='1'){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}