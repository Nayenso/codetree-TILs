import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];

        for(int i=0; i<n; i++){
            price[i] = sc.nextInt();
        }

        int minPrice = Integer.MAX_VALUE;  // 현재까지의 최소 가격
        int maxProfit = 0;  // 최대 이익

        // 배열 순회하면서 최대 이익 계산
        for(int i=0; i<n; i++){
            if(price[i] < minPrice) {
                minPrice = price[i];  // 새로운 최소 가격 갱신
            }
            int profit = price[i] - minPrice;  // 현재 가격에서 팔았을 때의 이익 계산
            if(profit > maxProfit) {
                maxProfit = profit;  // 최대 이익 갱신
            }
        }

        System.out.print(maxProfit);  // 최대 이익 출력
    }
}