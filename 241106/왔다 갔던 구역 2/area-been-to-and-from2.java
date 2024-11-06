import java.util.*;

public class Main {
    public static final int OFF_SET = 1000;
    public static int[] space;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        space = new int[2001];
        int start = 0;

        for(int i=0; i<n; i++){
            String temp = sc.nextLine();
            String[] op = temp.split(" ");
            
            if (temp.isEmpty()) {
                i--;
                continue;
            }
            int Len = Integer.valueOf(op[0]);

            start = trace(Len, start, op[1]);
        }
        int cnt = 0;

        for(int i=0; i<2001; i++){
            if(space[i]>=2){
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    public static int trace(int len, int start, String op){
        int re;
        if(op.equals("R")){
            for(int i=start+OFF_SET; i<start+len+OFF_SET; i++){
                space[i]++;
            }
            re = start+len;
        }else{
             for(int i=start-len+OFF_SET; i<start+OFF_SET; i++){
                space[i]++;
            }
            re = start-len;
        }
        return re;
    }
}