public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7, temp;
        temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.print(a+"\n"+b+"\n"+c);
    }
}