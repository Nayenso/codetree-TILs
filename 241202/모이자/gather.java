import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int minLen = Integer.MAX_VALUE;
        
        for(int i=0; i<n; i++){
            int tempLen = 0;
            
            for(int j=0; j<n; j++){
                int index = j-i;
                if(index<0){
                    index*=-1;
                }
                tempLen += arr[j]*index;
            }
            if(tempLen<minLen){
                minLen = tempLen;
            }
        }
        System.out.print(minLen);
    }
}