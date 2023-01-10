package 메소드연습;
// 메소드 이름 규칙 : 변수 만드는 규칙과 동일 (대소문자, _, $, 숫자 사용 가능(숫자가 맨 앞에 오면 안됨))
//camel 표기법 사용
// 접근제한자 반환타입 메소드이름(매개변수목록) { 구현부 ; return }

import java.util.Scanner;

public class ClassMethod {
    public static void main(String[] args) {
        Sample sample = new Sample(); // 클래스 내에 생성자가 없으면 기본 생성자가 호출 됨
        Scanner sc = new Scanner(System.in);
        System.out.print("정수값 입력 : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rst = sample.sum(n1,n2); // sum()은 매개변수와 반환값이 있는 메소드
        System.out.println(rst);
        System.out.println(sample.sayStr());

        sample.say();


    }
}


