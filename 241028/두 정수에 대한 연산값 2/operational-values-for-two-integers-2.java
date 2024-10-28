import java.util.*;

class temp{
    int num;
    public temp(int value){
        num = value;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        temp tA = new temp(a), tB = new temp(b);
        change(tA, tB);
        System.out.print(tA.num+" "+tB.num);
    }
    
    public static void change(temp a, temp b){
        if(a.num>b.num){
            a.num *= 2;
            b.num += 10;
        }else{
            a.num += 10;
            b.num *= 2;
        }
    }
}