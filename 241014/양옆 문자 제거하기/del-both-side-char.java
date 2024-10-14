import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c = str.toCharArray();
        String re = "";

        for(int i=0; i<c.length; i++){
            if(i==1|| i==c.length-2){
                continue;
            }else{
                re+=c[i];
            }
        }
        System.out.print(re);
    }
}