import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bi = sc.next();
        int num = 0;

        for(int i=0; i<bi.length(); i++){
            num = num*2 + (bi.charAt(i)-'0');
        }
        num *=17;
        int[] arr = new int[20];
        int index = 0;

        while(true){
            if(num<2){
                arr[index++] = num;
                break;
            }
            arr[index++] = num%2;
            num/=2;
        }

        for(int i=index-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}