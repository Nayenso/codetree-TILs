import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if(a <= 0){
            System.out.print(0);
        }else{
            for(int i = 0; i < b; i++){
                System.out.print(a);
            }
        }
    }
}