package 기본프로그램; //접근제한자(캡슐화)와 연관성 있음

//접근제한자 : public. protected, default, private
/*

여기는 범위 주석 입니다.
주석이란 사람은 이해하고 컴파일러는 무시하는 영역

 */

public class Sample { //클래스 이름 지정, 클래스 이름과 파일 이름 같아야함, 첫자 대문자
    //main 메소드는 프로그램의 시작 위치를 의미하며 JVM이 호출함.
    //void는 메소드 실행 이후의 반환 타입 중 하나
    public static void main(String[] args) {
        System.out.println("Hello, java !");
    }
}
