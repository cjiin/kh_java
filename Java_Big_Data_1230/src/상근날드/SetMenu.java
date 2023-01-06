package 상근날드;
// 상근날드 가게에서는 세트 메뉴를 판매
// 햄버거는 3가지 종류가 있고 음료는 2가지 종류가 있음
// 입력은 총 5개의 값을 연속으로 입력하는데 햄버거 3가지, 음료 2가지의 가격을 연속으로 입력 01234
// 햄버거 3가지 중 가장 싼 메뉴 선택, 음료 2중 가장 싼 것 선택하고 , 세트메뉴이기 때문에 50원 할인
// 총 세트 메뉴의 금액을 구하는 문제

import java.util.Scanner;

public class SetMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];

        for (int i = 0; i < num.length; i++) {
            num[i] =sc.nextInt();
            if (num[0] > num[1]) {
                num[0] = num[1];
            }

        }

    }
}