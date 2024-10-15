import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String op = sc.next();
        char[] opArr = op.toCharArray();

        for(int i=0; i<op.length(); i++){
            char c = opArr[i];
            int len = A.length();

            switch(c){
                case 'L':
                    char[] AArr = A.toCharArray();
                    char front = AArr[0];
                    for(int j=1; j<len; j++){
                        AArr[j-1] = AArr[j];
                    }
                    AArr[len-1] = front;
                    A = String.valueOf(AArr);
                    break;
                case 'R':
                    char[] Arr = A.toCharArray();
                    char end = Arr[len-1];
                    for(int j=len-1; j>=1; j--){
                        Arr[j] = Arr[j-1];
                    }
                    Arr[0] = end;
                    A = String.valueOf(Arr);
                    break;
            }
        }
        System.out.print(A);
    }
}