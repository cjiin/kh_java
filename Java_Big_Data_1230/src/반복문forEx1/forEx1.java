package 반복문forEx1;

import java.util.Scanner;

//for 반복문 : for(초기식;조건식;증감식) {반복 수행 구간}
public class forEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("정수의 합은 : " + sum);
    }
}


//        for (int i = 1; i <= 100; i++) {
//            System.out.printf("%4d", i);
//            if (1 % 10 == 0) System.out.println();
//        }

//        int i = 1;
//        while (true) {
//            System.out.printf("%4d", i);
//            if (i % 10 == 0)  System.out.println();
//            if (i == 100) break;
//            i++;


