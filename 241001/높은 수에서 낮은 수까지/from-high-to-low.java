import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(a>b){
            for(int i=a; i >=b; i--){
                System.out.print(i+" ");
            }
        }else{
            for(int i= b; i>=a; i--){
                System.out.print(i+" ");
            }
        }
    }
}