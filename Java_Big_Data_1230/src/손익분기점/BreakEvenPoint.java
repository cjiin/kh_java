package 손익분기점;

import java.util.Scanner;

// 첫번째 : 고정비용
// 두번째 : 가변비용
// 세번째 : 판매금액
//입력: 첫째 줄에 A,B,C가 순서대로 주어진다. A,B,C는 21억 이하의 자연수이다.
//출력: 첫째 줄에 손익분기점, 즉 최초로 이익이 발생하는 판매량 출력, 손익분기점이 존재하지 않으면 -1 출력
public class BreakEvenPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fixCost = sc.nextInt(); //고정비용
        int varCost = sc.nextInt(); //가변비용(생산비용)
        int sellPrice = sc.nextInt();  //판매금액
        if(varCost >= sellPrice) {
            System.out.println("-1");
            return;
        }
        System.out.println((fixCost/(sellPrice-varCost)) + 1);

    }

}
