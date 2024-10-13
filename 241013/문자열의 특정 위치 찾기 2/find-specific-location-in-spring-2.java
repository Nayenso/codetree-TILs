import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        char c = sc.next().charAt(0);
        String[] str = {"apple", "banana", "grape", "blueberry", "orange"};
        
        for(int i=0; i<5; i++){
            for(int j=0; j<str[i].length(); j++){
                if(str[i].charAt(2)==c || str[i].charAt(3)==c){
                    cnt++;
                    System.out.println(str[i]);
                    break;
                }
            }
        }
        System.out.print(cnt);
    }
}