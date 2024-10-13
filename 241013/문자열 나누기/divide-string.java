import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        String re = ""; 

        for(int i=0; i<n; i++){
            String str = sc.next();
            re += str;
        }

        for(int i=0; i<re.length(); i++){
            if(cnt == 5){
                System.out.println();
                cnt = 0;
            }
            System.out.print(re.charAt(i));
            cnt++;
        }
    }
}