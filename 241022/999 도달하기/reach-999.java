import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = 1;
        int r = n;
        System.out.printf("%d %d ",h,r);
        while(true){
            int sum = h+r;
            System.out.print(sum+" ");
            if(sum>999){
                break;
            }
            h = r;
            r = sum;
        }
    }
}