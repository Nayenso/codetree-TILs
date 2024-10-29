import java.util.*;

class product{
    String name;
    int code;

    public product(){
    }

    public product(String s, int c){
        name = s;
        code = c;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        product p1 = new product("codetree", 50);

        String na = sc.next();
        int n = sc.nextInt();

        product p2 = new product(na, n);
        System.out.printf("product %d is %s\n",p1.code, p1.name);
        System.out.printf("product %d is %s\n",p2.code, p2.name);
    }
}