import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] alpha = new char[5][3];

        for(int i=0; i<alpha.length; i++){
            for(int j=0; j<alpha[i].length; j++){
                alpha[i][j] = sc.next().charAt(0);
            }
        }

        for(int i=0; i<alpha.length; i++){
            for(int j=0; j<alpha[i].length; j++){
                if(Character.isLowerCase(alpha[i][j])){
                    char c = Character.toUpperCase(alpha[i][j]);
                    System.out.print(c+" ");
                }
            }
            System.out.println();
        }   
    }
}