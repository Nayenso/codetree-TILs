import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i=0; ;){
            int n = input.nextInt();
            if(i>3){
                break;
            }
            if(n%2==0){
                System.out.println(n/2);
                i++;
            }else{
                i++;
                continue;
            }
        }
    }
}