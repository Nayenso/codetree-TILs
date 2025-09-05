import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dgree = sc.nextInt();

        if(dgree<0){
            System.out.print("ice");
        }else if(dgree>=100){
            System.out.print("vapor");
        }else{
            System.out.print("water");
        }
    }
}