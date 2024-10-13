import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int cnt = 1;
        String re = "";

        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                cnt++;
            }else{
                re+=str.charAt(i);
                re+=cnt;
                cnt = 1;
            }
        }
        re+=str.charAt(str.length()-1);
        re+=cnt;

        System.out.println(re.length());
        System.out.print(re);
    }
}