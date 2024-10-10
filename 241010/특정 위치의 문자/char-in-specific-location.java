import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] c = {'L','E','B','R','O','S'};
        char t = sc.next().charAt(0);
        int index = -1;

        for(int i=0; i<6; i++){
            if(c[i]=='t'){
                index = i;
            }
        }
        if(index == -1){
            System.out.print("None");
        }else{
            System.out.print(index);
        }
        
    }
}