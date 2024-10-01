import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for(int i = 1; i <= n; i++){
            if(i%2==0||i%3==0){
                System.out.print(1+" ");
            }else{
                System.out.print(0+" ");
            }
        }
    }
}