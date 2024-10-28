import java.util.*;

class temp{
    int value;
    public temp(int value){
        this.value = value;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        temp tA = new temp(a), tB = new temp(b);
        change(tA, tB);
        System.out.print(tA.value+" "+tB.value);
    }

    public static void change(temp a, temp b){
        if(a.value>b.value){
            a.value += 25;
            b.value *= 2;
        }else{
            a.value *= 2;
            b.value += 25;
        }
    }
}