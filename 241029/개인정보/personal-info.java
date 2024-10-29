import java.util.*;

class human implements Comparable<human>{
    String name;
    int tall;
    double heavy;

    public human(){}
    public human(String n, int t, double h){
        name = n;
        tall = t;
        heavy = h;
    }

    @Override
    public int compareTo(human temp){
        return this.name.compareTo(temp.name);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        human[] arr = new human[5];

        for(int i=0; i<5; i++){
            String Name = sc.next();
            int Tall = sc.nextInt();
            double Heavy = sc.nextDouble();

            arr[i] = new human(Name, Tall, Heavy);
        }

        Arrays.sort(arr);

        System.out.println("name");
        for(int i=0; i<5; i++){
            System.out.printf("%s %d %.1f\n",arr[i].name,arr[i].tall,arr[i].heavy);
        }
        System.out.println();

        Arrays.sort(arr, new Comparator<human>(){
            @Override
            public int compare(human a, human b){
                return b.tall-a.tall;
            }
        });

        System.out.println("height");
        for(int i=0; i<5; i++){
            System.out.printf("%s %d %.1f\n",arr[i].name,arr[i].tall,arr[i].heavy);
        }
    }
}