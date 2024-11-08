import java.util.*;

public class Main {
    public static int n1;
    public static int n2;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int[] A = new int[n1], B = new int[n2];
        
        makeArr(A);
        makeArr(B);

        if(isSame(A,B)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }

    public static void makeArr(int[] temp){
        int size = temp.length;

        for(int i=0; i<size; i++){
            temp[i] = sc.nextInt();
        }
    }

    public static boolean isSame(int[] A, int[] B){
        if(n1==n2){
            for(int i=0; i<n1; i++){
                if(A[i]!=B[i]){
                    return false;
                }
            }
            return true;
        }else if(n2>n1){
            return false;
        }else{
            for(int i=0; i<=n1-n2; i++){
                boolean flag = true;

                for(int j=0; j<n2; j++){
                    if(A[i+j] != B[j]){
                        flag = false;
                        break;
                    }
                }
                if(flag == true){
                    return true;
                }
            }

            return false;
        }
    }
}