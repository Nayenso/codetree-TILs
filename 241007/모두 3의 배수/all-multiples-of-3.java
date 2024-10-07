import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        for(int i=0; i<5; i++){
            int n = sc.nextInt();
            if(n%3==0){
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