import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        while(a<b){
            System.out.print(a+" ");
            if(a%2!=0){
                a*=2;
            }
            if(a%2==0){
                a+=3;
            }
        }

    }
}