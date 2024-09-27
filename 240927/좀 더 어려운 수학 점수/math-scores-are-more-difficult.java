import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int aMath = input.nextInt();
        int aEng = input.nextInt();
        int bMath = input.nextInt();
        int bEng = input.nextInt();
        
        if(aMath == bMath){
            if(aEng > bEng){
                System.out.print("A");
            }else{
                System.out.print("B");
            }
        }
        else{
            int flag = aMath>bMath?1:0;
            if(flag == 1){
                System.out.print("A");
            }else if(flag == 0){
                System.out.print("B");
            }
        }
    }
}