import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[200];
        int index = 0;
        int cnt = 0;

        while(true){
            String str = sc.next();
            if(str.equals("0")){
                break;
            }
            arr[index++] = str;
            cnt++;
        }
        System.out.println(cnt);
        for(int i=1; i<=index; i++){
            if(i%2!=0){
                System.out.println(arr[i-1]);
            }
        }
    }
}