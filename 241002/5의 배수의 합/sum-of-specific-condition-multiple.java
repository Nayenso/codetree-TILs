import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = 0;

        if(b>a){
            for(int i=a; i<=b; i++){
                if(i%5==0){
                    sum+=i;
                }
            }
        }else{
            for(int i=b; i<=a; i++){
                if(i%5==0){
                    sum+=i;
                }
            }
        }

        System.out.print(sum);
    }
}