import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String part = sc.next();
        System.out.print(findIndex(str,part));
    }

    public static int findIndex(String str, String part){
        int id1 = str.length(), id2 = part.length();
        for(int i=0; i<=id1-id2; i++){
            boolean flag = true;
            for(int j=0; j<id2; j++){
                if(str.charAt(i+j) != part.charAt(j)){
                    flag = false;
                }
            }
            if(flag == true){
                return i;
            }
        }
        return -1;
    }
}