import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A_ma, A_en, B_ma, B_en;

        A_ma = sc.nextInt();
        A_en = sc.nextInt();
        B_ma = sc.nextInt();
        B_en = sc.nextInt();

        if(A_ma>B_ma && A_en>B_en){
            System.out.print(1);
        }else{
            System.out.print(0);
        }
    }
}