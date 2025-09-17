import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt();
        
        while(A<=B){
            System.out.print(A+" ");
            if(A%2==0){
                A+=3;
            }else{
                A*=2;
            }
        }
    }
}