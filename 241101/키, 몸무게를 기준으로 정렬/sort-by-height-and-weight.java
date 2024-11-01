import java.util.*;

class people implements Comparable<people>{
    String name;
    int tall;
    int heavy;

    public people(){}
    public people(String n, int t, int h){
        name = n;
        tall = t;
        heavy = h;
    }

    @Override
    public int compareTo(people a){
        if(this.tall == a.tall){
            return a.heavy-this.heavy;
        }
        return this.tall - a.tall;
    } 
}

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static int n;

    public static void main(String[] args) {
        n = sc.nextInt();
        people[] arr = new people[n];

        makeArr(arr);
        Arrays.sort(arr);
        printArr(arr);
    }

    public static void makeArr(people[] temp){
        for(int i=0; i<n; i++){
            String tempN = sc.next();
            int tempT = sc.nextInt();
            int tempH = sc.nextInt();

            temp[i] = new people(tempN, tempT, tempH);
        }
    }

    public static void printArr(people[] temp){
        for(int i=0; i<n; i++){
            System.out.println(temp[i].name+" "+temp[i].tall+" "+temp[i].heavy);
        }
    }
}