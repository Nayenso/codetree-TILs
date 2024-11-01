import java.util.*;

class point implements Comparable<point>{
    int x, y;
    int num, len;

    public point(){}
    public point(int xT, int yT, int n, int l){
        x = xT;
        y = yT;
        num = n;
        len = l;
    }

    @Override
    public int compareTo(point p){
        if(this.len == p.len){
            return this.num - p.num;
        }
        return this.len - p.len;
    }
}

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int n;

    public static void main(String[] args) {
        n = sc.nextInt();
        point[] arr = new point[n];
        makeArr(arr);
        Arrays.sort(arr);
        printArr(arr);
    }

    public static void makeArr(point[] temp){
        for(int i=0; i<n; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            if(x1<0){
                x1*=-1;
            }
            if(y1<0){
                y1*=-1;
            }

            int L = x1+y1;

            temp[i] = new point(x1, y1, i+1, L);
        }
    }

    public static void printArr(point[] temp){
        for(int i=0; i<n; i++){
            System.out.println(temp[i].num);
        }
    }
}