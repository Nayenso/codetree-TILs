import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();

        for(int i=1; i<=n; i++){
            q.add(i);
        }

        while(q.size()>1){
            for(int i=0; i<k-1; i++){
                q.add(q.poll());
            }
            System.out.print(q.poll()+" ");
        }
        System.out.print(q.poll());
    }
}