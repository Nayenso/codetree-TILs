import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] hostpital = new int[4];

        for(int i=0; i<3; i++){
            char sick = sc.next().charAt(0);
            int temp = sc.nextInt();

            if(temp >= 37 && sick == 'Y'){
                hostpital[0]++;
            }else if(temp >= 37 && sick == 'N'){
                hostpital[1]++;
            }else if(temp < 37 && sick == 'Y'){
                hostpital[2]++;
            }else{
                hostpital[3]++;
            }
        }

        for(int i: hostpital){
            System.out.print(i+" ");
        }
        if(hostpital[0]>=2){
            System.out.print('E');
        }
    }
}