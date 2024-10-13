import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[10];
        boolean flag = false;

        for(int i=0; i<10; i++){
            str[i] = sc.next();
        }
        char c = sc.next().charAt(0);

        for(int i=0; i<10; i++){
            int index = str[i].length();
            if(str[i].charAt(index-1) == c){
                System.out.println(str[i]);
                flag = true;
            }
        }
        if(flag == false){
            System.out.print("None");
        }
    }
}