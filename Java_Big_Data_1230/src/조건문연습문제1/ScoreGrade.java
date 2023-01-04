package 조건문연습문제1;

import java.sql.SQLOutput;
import java.util.Scanner;

//성적을 입력 받음
// 입력받은 값이 0 ~ 100 사이가 아니면 "잘못 입력 하였습니다" 출력
// 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D,나머지는 F
public class ScoreGrade {
    public static void main(String[] args) {
        // 스캐너 객체 생성, 생성된 개체에 정수값을 입력받음.
        // 조건문에 값이 0과  100 사이인 경우 해당 학점 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("성적을 입력하세요 : ");
        int number = sc.nextInt();
        if (number < 0 || number > 100) return;

        if (number >= 90) System.out.println("A");
        else if (number >= 80) System.out.println("B");
        else if (number >= 70) System.out.println("C");
        else if (number >= 60) System.out.println("D");
        else System.out.println("F");


    }
}
