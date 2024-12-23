import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String wd = sc.next();
        int cnt = 0;
        char[] arr = wd.toCharArray();

        for(int i=0; i<n-2; i++){
            char c1 = arr[i];
            if(c1=='C'){
                for(int j=i+1; j<n-1; j++){
                    char c2 = arr[j];
                    if(c2=='O'){
                        for(int k=j+1; k<n; k++){
                            char c3 = arr[k];
                            if(c3=='W'){
                                cnt++;
                            }
                        } 
                    }
                }
            }
        }
        System.out.print(cnt);
    }
}