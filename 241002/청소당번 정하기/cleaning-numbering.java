import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int classRoom = 0, wall = 0, toilet = 0;
        int n = input.nextInt();
        for(int i=1; i<n; i++){
            if(i%12==0){
                toilet++;
            }else if(i%2==0 && i%3==0){
                wall++;
            }else if(i%2==0){
                classRoom++;
            }else if(i%3==0){
                wall++;
            }
        }
        System.out.print(classRoom+" "+wall+" "+toilet);
    }
}