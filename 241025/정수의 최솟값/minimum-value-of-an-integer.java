import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(minNum(a,b,c));
    }

    public static int minNum(int a, int b, int c){
        int[] arr = {a,b,c};
        Arrays.sort(arr);
        return arr[0];
    }
}