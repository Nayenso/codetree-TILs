import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        boolean flag=false;
        int[] one = new int[n1], two = new int[n2];

        for(int i=0; i<n1; i++){
            one[i] = sc.nextInt();
        }
        for(int i=0; i<n2; i++){
            two[i] = sc.nextInt();
        }
        if(n2 > n1){
            System.out.print("No");
        }else{
            for(int i=0; i<=n1-n2; i++){
                flag = true;
                    for(int t=0; t<n2; t++){
                        if(one[i+t]!=two[t]){
                            flag = false;
                            break;
                        }
                    }
                if(flag == true){
                    break;
                }
                }
            }

        if(flag == true){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}