import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int c = sc.nextInt();

        for(int i=0; i<c; i++){
            int flag = sc.nextInt();
            if(flag == 1){
                int a = sc.nextInt();
                int b = sc.nextInt();
                char[] t = str.toCharArray();
                char temp = t[a-1];
                t[a-1] = t[b-1];
                t[b-1] = temp;
                str = String.valueOf(t);
                System.out.println(str);
            }
            if(flag == 2){
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                char[] t = str.toCharArray();
                
                for(int j=0; j<t.length; j++){
                    if(t[j]==a){
                        t[j]=b;
                    }
                }
                str = String.valueOf(t);
                System.out.println(str);
            }
        }
    }
}