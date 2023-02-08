package 블랙잭;
// 5 25 => 카드 장수, 주어진 값
// 5 6 7 8 9 => 카드 중 3장의 카드를 골라서 주어진 값과 갖거나 작은 값 중 제일 가까운 값을 찾아야 함.
// 입력 : 첫째 줄에 카드의 장수와 주어진 값 M이 주어짐. 둘째 줄에는 카드에 쓰여 있는 수가 주어짐.
// 합이 M을 넘지 않는 카드 3장을 찾을 수 있는 경우만 입력
// 출력 : 첫째 줄에 M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 출력


import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0; // 3 장의 카드의 합
        int rst = 0; // 3 장의 카드의 합으로 만들어진 결과 값
        System.out.print("카드 장 수 : ");
        int cnt = sc.nextInt();
        System.out.print("주어진 값 : ");
        int m = sc.nextInt();
        int[] arr = new int [cnt];
        for(int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }
        for(int i = 0; i < cnt; i++) {
            for(int j = i +1; j < cnt; j++) {
                for(int k = j + 1; k < cnt; k++ ) {
                    sum = arr[i] + arr[j] + arr[k];
                    if(sum <= m && rst < sum) rst = sum;
                }
            }
        }
        System.out.println("결과 : " + rst);


    }
}
