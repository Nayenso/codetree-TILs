import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dice = new int[10];
        int[] index = new int[7];

        for(int i=0; i<10; i++){
            dice[i] = sc.nextInt();
        }

        for(int i=0; i<10; i++){
            index[dice[i]]++;
        }

        for(int i=1; i<7; i++){
            System.out.println(i+" - "+index[i]);
        }
    }
}