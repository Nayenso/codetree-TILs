import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.next();
        String str2 = sc.next();
        
        if(isSame(str1, str2)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static boolean isSame(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }

        char[] temp1 = s1.toCharArray();
        char[] temp2 = s1.toCharArray();

        Arrays.sort(temp1);
        Arrays.sort(temp2);

        for(int i=0; i<temp1.length; i++){
            if(temp1[i] != temp2[i]){
                return false;
            }
        }
        return true;
    }
}