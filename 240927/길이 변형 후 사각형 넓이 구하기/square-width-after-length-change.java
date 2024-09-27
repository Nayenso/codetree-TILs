import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int garo = input.nextInt();
        int sero = input.nextInt();
        garo += 8;
        sero *= 3;
        System.out.print(garo+"\n"+sero+"\n"+garo*sero);
    }
}