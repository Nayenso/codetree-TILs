import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt(), D = sc.nextInt();
        boolean flag = isMonth(M,D);
        if(flag){
            System.out.print("Yes");
        }else{
        System.out.print("No");
        }
    }

    public static boolean isMonth(int M, int D){
        if(M==2){
            return(1<=D && D<=28);
        }
        if(M==4||M==6||M==9||M==11){
            return (1<=D && D<=30);
        }
        if(M==1||M==3||M==5||M==7||M==8||M==10||M==12){
            return (1<=D && D<=30);
        }
        return false;
    }
}