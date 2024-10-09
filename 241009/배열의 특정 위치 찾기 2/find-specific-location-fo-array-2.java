import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd=0, even=0;
        int[] n = new int[10];
        for(int i=0; i<10; i++){
            n[i] = sc.nextInt();
            if(n[i]%2==0){
                even+=n[i];
            }else{
                odd+=n[i];
            }
        }
        System.out.print(odd>even?odd-even:even-odd);
    }
}