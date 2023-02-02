package 숫자의합;

import java.util.ArrayList;
import java.util.Scanner;

// 문제 : N개의 숫자가 공백 없이 쓰여 있음. 이 숫자를 모두 합해서 출력하는 문제
// 입력 : 54321
// 출력 : 15
// 입력 : 70000000
// 출력 : 7
// 입력 : 5678
// 출력 : 26
// 입력 : 0000
// 프로그램 종료
public class NumberSumEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int sum = 0; //한번 계산 결과를 출력후 초기화가 되어야 하기 때문에 while 문 안에 초기화해줌
            String num = sc.next();
            if (num.equals("0000")) break;
            for (int i = 0; i < num.length(); i++) {
                sum += num.charAt(i)-'0';
            }
                System.out.println("출력 : " + sum);
            }



    }
}
