import java.util.*;

class people{
    String name;
    String locanum;
    String location;

    public people(String name, String locanum, String location){
        this.name = name;
        this.locanum = locanum;
        this.location = location;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        people[] arr = new people[n];
        String[] temp = new String[n];

        for(int i=0; i<n; i++){
            String na = sc.next();
            String lonu = sc.next();
            String loca = sc.next();
            temp[i] = na;
            arr[i] = new people(na,lonu, loca); 
        }

        Arrays.sort(temp);
        int index = -1;
        for(int i=0; i<n; i++){
            if(temp[n-1].equals(arr[i].name)){
                index = i;
            }
        }
        System.out.printf("name %s\naddr %s\ncity %s", arr[index].name,arr[index].locanum,arr[index].location);
    }
}