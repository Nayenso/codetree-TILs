import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;
        double[] grade = new double[n];

        for(int i=0; i<n; i++){
            grade[i] = sc.nextDouble();
        } 

        for(double a : grade){
            sum+=a;
        }
        if(sum/n>=4.0){
            System.out.printf("%.1f\n",sum/n);
            System.out.print("Perfect");
        }else if(sum/n>=3.0){
            System.out.printf("%.1f\n",sum/n);
            System.out.print("Good");
        }else {
            System.out.println(sum/n);
            System.out.print("Poor");
        }
    }
}