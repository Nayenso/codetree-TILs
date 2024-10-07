import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        for(int i=2; i<n; i++){
            if(n%i==0){
                flag = true;
            }
        }
        if(flag == true){
            System.out.print("C");
        }else{
            System.out.print("N");
        }
    }
}