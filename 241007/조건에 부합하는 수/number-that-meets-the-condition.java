import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i=1; i<=n; i++){
            if(i%2==0 && i%4!=0){
                continue;
            }
            if((i/8)%2==0){
                continue;
            }
            if(i%7<4){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}