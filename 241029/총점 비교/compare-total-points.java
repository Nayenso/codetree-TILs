import java.util.*;

class students implements Comparable<students>{
    String name;
    int s1, s2, s3;

    public students(){}
    
    public students(String n, int a, int b, int c){
        name = n;
        s1 = a;
        s2 = b;
        s3 = c;
    }

    @Override
    public int compareTo(students temp){
        return (s1+s2+s3)-(temp.s1+temp.s2+temp.s3);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        students[] arr = new students[n];

        for(int i=0; i<n; i++){
            String Name = sc.next();
            int S1 = sc.nextInt();
            int S2 = sc.nextInt();
            int S3 = sc.nextInt();

            arr[i] = new students(Name, S1, S2, S3);
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            System.out.println(arr[i].name+" "+arr[i].s1+" "+arr[i].s2+" "+arr[i].s3);
        }
    }
}