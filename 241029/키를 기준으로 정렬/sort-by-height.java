import java.util.*;

class specs implements Comparable<specs>{
    String name;
    int weight;
    int heavy;

    public specs(String name, int weight, int heavy){
        this.name = name;
        this.weight = weight;
        this.heavy = heavy;
    }

    @Override
    public int compareTo(specs temp){
        return this.weight-temp.weight;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        specs[] arr = new specs[n];

        for(int i=0; i<n; i++){
            String Name = sc.next();
            int Weight = sc.nextInt();
            int Heavy = sc.nextInt();

            arr[i] = new specs(Name, Weight, Heavy);
        }

        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            System.out.println(arr[i].name+" "+arr[i].weight+" "+arr[i].heavy);
        }
    }
}