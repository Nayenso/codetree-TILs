import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a = 'A';

        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }

            for(int j=i; j<=n; j++){
                System.out.print(a+" ");
                if(a=='Z'){
                    a='A';
                }else{
                    a++;
                }
            }
            System.out.println();
        }
    }
}