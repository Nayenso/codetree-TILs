import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] st = new int[100];
        int[] grade = new int[11];
        int index = 0;

        for(int i=0; i<100; i++){
            st[i] = sc.nextInt();
            if(st[i]==0){
                index = i;
                break;
            }
        }

        for(int i=0; i<index; i++){
            if(st[i]<10){
                continue;
            }
            int t = st[i]/10;
            grade[t]++;
        }

        for(int i=10; i>=1; i--){
            System.out.println(10*i+" - "+grade[i]);
        }
    }
}