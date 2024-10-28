import java.util.*;

class makeNum{
    int value;
    public makeNum(int value){
        this.value = value;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        makeNum a = new makeNum(n);
        makeNum b = new makeNum(m);
        swap(a,b);
        System.out.printf("%d %d",a,b);
    }

    public static void swap(makeNum a, makeNum b){
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}