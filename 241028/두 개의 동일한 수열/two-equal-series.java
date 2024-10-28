import java.util.*;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] A = new int[n], B = new int[n];

        inputNew(A);
        inputNew(B);

        Arrays.sort(A);
        Arrays.sort(B);

        if(isSame(A,B)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static void inputNew(int[] temp){
        for(int i=0; i<temp.length; i++){
            temp[i] = sc.nextInt();
        }
    }

    public static boolean isSame(int[] a, int[] b){
        for(int i=0; i<a.length; i++){
            if(a[i] != b[i]){
                return false;
            }
        }
        return true;
    }
}