import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];
        int tSum = 0;
        int[] sSum = new int[4];

        for(int i=0; i<arr.length; i++){
            int gSum = 0;
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
                sSum[j] += arr[i][j];
                gSum += arr[i][j];
                tSum+=arr[i][j];
            }
            System.out.printf("%.1f ", gSum/4.0);
            if(i == arr.length-1){
                System.out.println();
            }
        }

        for(int i=0; i<4; i++){
             System.out.printf("%.1f ", sSum[i]/2.0);
        }
        System.out.println();
        System.out.printf("%.1f ", tSum/8.0);
    }
}