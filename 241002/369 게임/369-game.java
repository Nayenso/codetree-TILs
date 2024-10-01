import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int flag = 0;

        for(int i=1; i<=n; i++){
            int a = i;
            while(a>0){
                if(a%10==3||a%10==6||a%10==9){
                    flag = -1;
                    break;
                }
                a /= 10;
            }

            if(i%3==0||flag == -1){
                System.out.print(0+" ");
            }else{
                System.out.print(i+" ");
            }
        }
    }
}