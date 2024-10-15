import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        int q = sc.nextInt();

        for(int i=0; i<q; i++){
            int op = sc.nextInt();
            int len = str.length();

            switch(op){
                case 1:
                    str = str.substring(1)+str.substring(0,1);
                    System.out.println(str);
                    break;
                case 2:
                    str = str.substring(len-1)+str.substring(0,len-1);
                    System.out.println(str);
                    break;
                case 3:
                    int start = 0, end = len-1;
                    char[] t = str.toCharArray();
                    while(start<end){
                        char temp = t[start];
                        t[start] = t[end];
                        t[end] = temp;
                        start++;
                        end--;
                    }
                    System.out.println(String.valueOf(t));
                    break;
            }
        }
    }
}