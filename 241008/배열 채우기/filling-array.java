import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[10];
        boolean flag = true;
        int index = 0;
        for(int i=0; i<10; i++){
            n[i] = sc.nextInt();
            if(n[i] == 0){
                index = i;
                flag = false;
                break;
            }
        }
        if(flag == true){
            for(int i=9; i>=0; i--){
                System.out.print(n[i]+" ");
            }
        }else{
            for(int i=index-1; i>=0; i--){
                System.out.print(n[i]+" ");
            }
        }
    }
}