import java.util.*;

class important{
    String code;
    char space;
    int time;

    public important(String code, char space, int time){
        this.code = code;
        this.space = space;
        this.time = time;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        char space = sc.next().charAt(0);
        int time = sc.nextInt();

        important temp = new important(code, space, time);
        System.out.println("secret code : "+temp.code);
        System.out.println("meeting point : "+temp.space);
        System.out.println("time : "+temp.time);
    }
}