import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 4; i++){
            int sum = 0;
            for(int j = 0; j < 4; j++){
                int n = input.nextInt();
                sum += n;
            }
            System.out.println(sum);
        }
    }
}