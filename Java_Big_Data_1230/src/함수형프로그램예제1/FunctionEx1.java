package 함수형프로그램예제1;
// 함수형 프로그램이란 : 자바 8에서 도입, 수학 공식과 유사, 불변성의 원칙, 조건문과 반복문 사용 금지 등의 특징을 가짐
// 람다(Lambda) : 화살표 표현식으로 사용 됩니다. 생략 가능한 모든 것을 생략하는 것을 기본 원칙을 함.
// 함수형 인터페이스 : 자바는 함수가 독립적으로 존재 할 수 없으므로 반드시 함수형 인터페이스가 필요

@FunctionalInterface
interface Calculator {
    int sum (int a, int b);
}
@FunctionalInterface
interface  MyFuncInterface {
    void method(int x); // 매개변수가 있는 타입
}

@FunctionalInterface
interface MyFuncInterface2 {
    int min(int x, int y); // 반환 타입이 있는 형식
}

public class FunctionEx1 {
    public static void main(String[] args) {
        Calculator mc = (a, b) -> a + b;
        int rst = mc.sum(3,4);
        System.out.println(rst);

        MyFuncInterface fi = x -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(2);

        MyFuncInterface2 f = (x,y) -> x < y ? x : y;
        System.out.println(f.min(3,4));
    }
}
