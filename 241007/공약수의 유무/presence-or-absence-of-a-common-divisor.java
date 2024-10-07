import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean flag = false;

        for(int i=a; i<=b; i++){
            if(1920%i==0 && 2880%i==0){
                flag = true;
            }
        }
        if(flag == true){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}