import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index = -1;
        String str = sc.next();
        char c = sc.next().charAt(0);

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c){
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.print("No");
        }else{
            System.out.print(index);
        }
    }
}