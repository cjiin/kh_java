package 제일큰값찾기;

import java.util.Scanner;

//세자리의 정수를 입력 받아서 100의 자리, 10의 자리, 1의 자리로 나누어 담고 가장 큰 수 찾기
public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("세자리 정수를 입력하세요 : ");
        int num = sc.nextInt(); // 키보드로부터 입력 받은 값을 변수에 담음
        int a = num / 100;
        int b = (num % 100) / 10;
        int c = num % 10;
        if(a > b){
            System.out.println(Math.max(a,c));
        }else {
            System.out.println(Math.max(b,c));
        }
    }
}
