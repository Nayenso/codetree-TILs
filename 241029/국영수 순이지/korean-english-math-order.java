import java.util.*;

class grade implements Comparable<grade>{
    String name;
    int kor;
    int eng;
    int math;

    public grade(String n, int k, int e, int m){
        name = n;
        kor = k;
        eng = e;
        math = m;
    }

    @Override
    public int compareTo(grade temp){
        if(this.kor == temp.kor){
            if(this.eng == temp.eng){
                return temp.math- this.math;
            }else{
                return temp.eng - this.eng;
            }
        }
        return temp.kor - this.kor;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        grade[] arr = new grade[n];

        for(int i=0; i<n; i++){
            String na =sc.next();
            int ko = sc.nextInt();
            int en = sc.nextInt();
            int ma = sc.nextInt();
            arr[i] = new grade(na, ko,en,ma);
        }

        Arrays.sort(arr);

        for(int i=0; i<n; i++){
            System.out.println(arr[i].name+" "+arr[i].kor+" "+arr[i].eng+" "+arr[i].math);
        }
    }
}