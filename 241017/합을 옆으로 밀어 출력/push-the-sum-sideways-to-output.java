import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i=0; i<n; i++){
            int temp = sc.nextInt();
            sum += temp;
        }

        String re =Integer.toString(sum);
        re = re.substring(1)+re.substring(0,1);

        System.out.print(re);
    }
}