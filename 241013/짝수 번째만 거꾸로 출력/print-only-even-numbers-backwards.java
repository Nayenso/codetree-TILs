import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String re = "";

        for(int i=1; i<=str.length(); i++){
            if(i%2==0){
                re += str.charAt(i-1);
            }
        }
        for(int i=re.length()-1; i>=0; i--){
            System.out.print(re.charAt(i));
        }

    }
}