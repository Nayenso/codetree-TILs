import java.util.*;

class idlevel{
    String id;
    int level;

    public idlevel(String id, int level){
        this.id = id;
        this.level = level;
    }

    public idlevel(){
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        idlevel n1 = new idlevel("codetree", 10);
        idlevel n2 = new idlevel();

        String temp = sc.next();
        int lv = sc.nextInt();

        n2.id = temp;
        n2.level = lv;

        System.out.printf("user %s lv %d\n",n1.id, n1.level);
        System.out.printf("user %s lv %d\n",n2.id, n2.level);
    }
}