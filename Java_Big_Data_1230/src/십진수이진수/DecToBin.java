package 십진수이진수;

import java.util.Scanner;
// 문제 : 배열을 사용하지 않고 10 진수를 입력받아 2 진수로 변경하고 이를 다시 10진수로 변경한다. 문자열 사용 금지
// 입력 : 10
// 이진수 : 1010
// 십진수 : 10
public class DecToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" 10진수 입력 : ");
        int num = sc.nextInt();
        num = decToBin(num); //static 이라 객체 생성 안하고 호출 가능
        System.out.println("2진수 : " + num);
        num = binToDec(num);
        System.out.println("10진수 : " + num);
    }
    static int decToBin(int dec) { // 10진수를 입력 받아서 2진수 반환 하는 메소드
        int calc; // 계산으로 만들어진 2진수 값
        int bin = 0; // 최종 결과
        int pos = 1; //자리 이동을 위한 포지션 변수
        while(dec !=0) {
            calc = dec % 2; //입력받은 값을 2로 나눈 나머지를 구함
            bin = bin + calc * pos;
            dec = dec / 2;
            pos = pos * 10;
        }
        return bin;

    }
   static int binToDec(int bin) { // 2진수를 입력 받아 10진수로 변환
        int dec = 0; //최종 결과
        int i = 0; // 인덱스 계산용 변수
        int tmp; // 계산을 위한 임시 값 저장용
       while(bin !=0) {
           tmp = bin % 10; // 10으로 나눈 나머지 구함
           bin = bin / 10;
           dec += tmp * Math.pow(2, i++);
       }

        return dec;
    }
}