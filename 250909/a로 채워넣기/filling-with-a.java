import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int size = str.length();

        String temp = str.substring(0,1)+"a"+str.substring(2,size-2)+"a"+str.substring(size-1);
        System.out.print(temp);
    }
}