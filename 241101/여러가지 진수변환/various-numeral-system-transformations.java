import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        int[] binary = new int[20];
        int index = 0;

        while(true){
            if(N<B){
                binary[index++] = N;
                break;
            }
            binary[index++] = N%B;
            N /= B;
        }

        for(int i=index-1; i>=0; i--){
            System.out.print(binary[i]);
        }
    }
}