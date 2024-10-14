import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0, y=0;
        int flag = 0;
        String op = sc.next();
                //북0  서1 남2  동3
        int[] dx = {0,-1, 0, 1};
        int[] dy = {1, 0, -1, 0};
        for(int i=0; i<op.length(); i++){
            char o = op.charAt(i);
            
            switch(o){
                case 'L':
                    if(flag==0){
                        flag = 1;
                    }else if(flag==1){
                        flag = 2;
                    }else if(flag==3){
                        flag = 0;
                    }else{
                        flag = 3;
                    }
                    break;
                case 'R':
                    if(flag==0){
                        flag = 3;
                    }else if(flag==1){
                        flag = 0;
                    }else if(flag==3){
                        flag = 2;
                    }else{
                        flag = 1;
                    }
                    break;
                case 'F':
                    x+=dx[flag];
                    y+=dy[flag];

            }
        }
        System.out.print(x+" "+y);
    }
}