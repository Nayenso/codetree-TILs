import java.util.*;

class num implements Comparable<num>{
    int n;

    public num(){}
    public num(int num){
        n = num;
    }

    public int compareTo(num temp){
        return this.n-temp.n;
    }
}

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int n;

    public static void main(String[] args) {
        n = sc.nextInt();
        num[] arr = new num[n];
        int[] k = new int[n];
        int[] answer = new int[n];

        makeArr(arr);
        copyIndex(arr, k);
        
        Arrays.sort(arr);

        checkIndex(arr, k, answer);
        printArr(answer);
    }

    public static void makeArr(num[] temp){
        for(int i=0; i<n; i++){
            int N = sc.nextInt();

            temp[i] = new num(N);
        }
    }

    public static void copyIndex(num[] temp, int[] NN){
        for(int i=0; i<n; i++){
            NN[i] = temp[i].n;
        }
    }

    public static void checkIndex(num[] Arr, int[] N, int[] A){
        int Index = 0;
        boolean[] flag = new boolean[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if((N[i]==Arr[j].n) && !flag[j]){
                    A[Index++] = (j+1);
                    flag[j] = true;
                    break;
                }
            }
        }
    }

    public static void printArr(int[] T){
        for(int i=0; i<n; i++){
            System.out.print(T[i]+" ");
        }
    }
}