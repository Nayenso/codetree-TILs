import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i=1; i<=3; i++){
            int n = input.nextInt();
            if(n%2==0){
                System.out.print(n/2);
            }else{
                continue;
            }
        }
    }
}