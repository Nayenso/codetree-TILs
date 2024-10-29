import java.util.*;

class students implements Comparable<students>{
    int weight, heavy, num;

    public students(){}
    public students(int w, int h, int n){
        weight = w;
        heavy = h;
        num = n;
    }

    @Override
    public int compareTo(students temp){
        if(this.weight == temp.weight){
            if(this.heavy == temp.heavy){
                return this.num - temp.num;
            }else{
                return temp.heavy - this.heavy;
            }
        }
        return temp.weight - this.weight;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        students[] arr = new students[n];

        for(int i=0; i<n; i++){
            int tall = sc.nextInt();
            int he = sc.nextInt();

            arr[i] = new students(tall, he, (i+1));
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            System.out.println(arr[i].weight+" "+arr[i].heavy+" "+arr[i].num);
        }
    }
}