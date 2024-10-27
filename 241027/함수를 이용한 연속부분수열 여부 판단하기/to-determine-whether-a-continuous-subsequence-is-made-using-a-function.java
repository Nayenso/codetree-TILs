import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] A = new int[n1];
        int[] B = new int[n2];

        for(int i=0; i<n1; i++){
            A[i] = sc.nextInt();
        }
        
        for(int i=0; i<n2; i++){
            B[i] = sc.nextInt();
        }
        boolean re = isContain(A,B);
        if(re){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
    public static boolean isContain(int[] A, int[] B){
        boolean flag = false;
        int s1 = A.length, s2 = B.length;
        for(int i=0; i<s1-s2; i++){
            boolean temp = true;
            if(A[i]==B[0]){
                for(int j=0; j<s2; j++){
                    if(A[i]!=B[j]){
                        temp = false;
                    }
                }
            }
            if(temp == true){
                flag = true;
            }
        }
        return flag;
    }
}