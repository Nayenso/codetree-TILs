import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int re = 1;
        for(int i = 1; i<=b; i++){
            if(i%a==0){
                re*=i;
            }
        }
        System.out.print(re);
    }
}