import java.util.*;

class need{
    String code;
    char color;
    int num;

    public need(String code, char color, int num){
        this.code = code;
        this.color = color;
        this.num = num;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        int n = sc.nextInt();

        need re = new need(s,c,n);
        System.out.printf("code : %s \ncolor : %c \nsecond : %d",re.code, re.color, re.num);
    }
}