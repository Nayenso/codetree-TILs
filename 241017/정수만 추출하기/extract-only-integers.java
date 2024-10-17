import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();
        int sum1 = 0, sum2 = 0;

        for(int i=0; i<str1.length(); i++){
            if('0' <= str1.charAt(i) && str1.charAt(i) <= '9'){
                sum1*=10;
                sum1+=str1.charAt(i)-'0';
            }else{
                break;
            }
        }
        for(int i=0; i<str2.length(); i++){
            if('0' <= str2.charAt(i) && str2.charAt(i) <= '9'){
                sum2*=10;
                sum2+=str2.charAt(i)-'0';
            }else{
                break;
            }
        }
        System.out.print(sum1+sum2);
    }
}