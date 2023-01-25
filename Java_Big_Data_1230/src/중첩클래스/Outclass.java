package 중첩클래스;

public class Outclass {
    private int num = 10; // 인스턴스 변수
    private static int sNum = 20; // 정적 변수 (클래스 소속의 변수)
    InClass inClass;
    public Outclass() { // 외부 클래스에 대한 생성자 호출
        inClass = new InClass();
    }
    class InClass {
        int inNum = 100;
        //static int sInNum = 200; //JDK 11버전 기준으로는 내부 클래스에 정적 변수를 선언 할 수 없음
        void inTest() {
            System.out.println("외부클래스의 인스턴스 변수 : "+ num);
            System.out.println("외부클래스의 정적 변수 : "+ sNum);
        }
        //static void sTest() {} // JDK 11버전 기준으로는 내부 클래스에 정적 메소드를 사용할 수 없음
    }
    public void usingClass() {
        inClass.inTest();
    }
}
