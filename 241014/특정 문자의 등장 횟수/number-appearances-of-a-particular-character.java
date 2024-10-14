import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int eCnt = 0, bCnt = 0;

        for(int i=0; i<str.length()-1; i++){
            if(str.substring(i,i+2).equals("ee")){
                eCnt++;
            }

            if(str.substring(i,i+2).equals("eb")){
                bCnt++;
            }
        }
        System.out.print(eCnt+" "+bCnt);
    }
}