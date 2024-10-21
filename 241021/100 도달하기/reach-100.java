import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 1, n2 = n;
        System.out.printf("%d %d ",n1, n2);
        while(true){
            int n3 = n1+n2;
            System.out.print(n3+" ");
            if(n3>100){
                break;
            }
            n1 = n2;
            n2 = n3;
        }
    }
}