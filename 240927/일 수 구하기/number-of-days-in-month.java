import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int flag = -1;
        if(n <= 8){
            flag = 0;
        }else{
            flag = 1;
        }

        if(n == 2){
            System.out.print(28);
        }else{
            if(flag == 0){
                if(n%2 != 0 || n == 8){
                    System.out.print(31);
                }else{
                    System.out.print(30);
                }
            }else{
                if(n%2 == 0){
                    System.out.print(31);
                }else{
                    System.out.print(30);
                }
            }
        }
    }
}