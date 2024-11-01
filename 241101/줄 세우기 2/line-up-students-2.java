import java.util.*;

class students implements Comparable<students>{
    int height;
    int heavy;
    int num;

    public students(){}
    public students(int hei, int hea, int n){
        this.height = hei;
        this.heavy = hea;
        this.num = n;
    }

    @Override
    public int compareTo(students temp){
        if(this.height == temp.height){
            return temp.heavy - this.heavy;
        }
        return this.height - temp.height;
    }
}
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int n;

    public static void main(String[] args) {
        n = sc.nextInt();
        students[] arr = new students[n];

        makeArr(arr);
        Arrays.sort(arr);
        printArr(arr);
    }

    public static void makeArr(students[] temp){
        for(int i=0; i<n; i++){
            int heightT = sc.nextInt();
            int heavyT = sc.nextInt();

            temp[i] = new students(heightT, heavyT, i+1);
        }
    }

    public static void printArr(students[] temp){
        for(int i=0; i<n; i++){
            System.out.print(temp[i].height+" ");
            System.out.print(temp[i].heavy+" ");
            System.out.println(temp[i].num+" ");
        }
    }
}