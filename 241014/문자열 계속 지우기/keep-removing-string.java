import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        int aLen = A.length(), bLen = B.length();

        if(aLen < bLen){
            System.out.print(A);
        }else{
            for(int i=0; i<aLen-bLen+1; i++){
                int index=A.indexOf(B);
                if(index == -1){
                    break;
                }
                A = A.substring(0,index)+A.substring(bLen+index);
                aLen = A.length();
            }
        }

        System.out.print(A);
    }
}