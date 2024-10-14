import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String cp = sc.next();
        int l = cp.length(), index = -1;

        for(int i=0; i<str.length()-l+1; i++){
            if(str.substring(i,i+l).equals(cp)){
                index = i;
                break;
            }
        }
        System.out.print(index);
        
    }
}