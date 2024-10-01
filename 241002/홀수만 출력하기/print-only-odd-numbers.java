import java.util.*
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i = 0; i < N; i++){
            int n = input.nextInt();
            if(n%2!=0 && n%3==0){
                System.out.println(i);
            }
        }
    }
}