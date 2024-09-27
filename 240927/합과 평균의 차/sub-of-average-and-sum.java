import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int avg = (a+b+c)/3;
        int re = (a+b+c)-avg;
        System.out.print(a+b+c+"\n"+avg+"\n"+re);
    }
}