import java.util.*;

class data {
    String day;
    String week;
    String weather;

    public data(String day, String week, String weather) {
        this.day = day;
        this.week = week;
        this.weather = weather;
    }

    public data() {}
}

public class Main {
    public static int n;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        n = sc.nextInt();
        data[] arr = new data[n];

        makeArr(arr);
    }

    public static void makeArr(data[] arr) {
        String[] temp = new String[100];
        int index = 0;

        for (int i = 0; i < n; i++) {
            String d = sc.next();
            String w = sc.next();
            String we = sc.next();

            arr[i] = new data(d, w, we);
            if (we.equals("Rain")) {
                temp[index++] = d;
            }
        }

        String[] rainDays = copyArr(temp, index);
        findRain(rainDays, arr);
    }

    public static String[] copyArr(String[] arr, int index){
        String[] t = new String[index];
        for(int i=0; i<index; i++){
            t[i] = arr[i];
        }
        return t;
    }

    public static void findRain(String[] temp, data[] arr) {
        Arrays.sort(temp);
        for (int i = 0; i < n; i++) {
            if (temp[0].equals(arr[i].day)) {
                System.out.print(arr[i].day + " " + arr[i].week + " " + arr[i].weather);
                break;
            }
        }
    }
}