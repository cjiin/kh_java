package 연산자연습1;

import java.util.Scanner;

// 이항연산자와 삼항연산자
// 산술연산자 : +, -, *,/, %
// 대입연산자 : 값을 변수에 대입할 때 사용, 대입은 항상 뒤에서 앞으로 일어남
// 복합대입연산자 : 연산 후 대입
// 증감연산자 : 값을 1 증가하거나 감소 시키는 연산자(단항 연산자)
// 우위와 전위에 따라 상황이 달라짐
// 비교연산자: 값의 크기를 비교하는 연산자
// 논리연산자: 참과 거짓을 판단 AND(&&) OR(||) NOT(!)
// 삼항연산자: 항이 3개인 연산자 ( 참과 거짓이 있는 조건문과 같음)
// 문자열 결합 연산자 : 문자열을 이어주는 연산자
public class OperatorEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이를 입력 하세요.");
        int age = sc.nextInt();
        boolean isAdult = (age >19) ? true : false;
        System.out.println(isAdult);

        System.out.println("Java" + (11.03 + 12));







    }
}