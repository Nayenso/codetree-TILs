import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a%3==0){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
        if(a%5==0){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }
}