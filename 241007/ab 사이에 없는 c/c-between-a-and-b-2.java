import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean flag = true;

        for(int i=a; i<=b; i++){
            if(i%c != 0){
                flag = false;
            }
        }

        if(flag = true){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}