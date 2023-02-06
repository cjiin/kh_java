package 진법변경;

import java.util.Scanner;

// 문제 : 배열을 사용하지 않고 10 진수가 주어지면 2 진수로 변경하고 이를 다시 진수로 변경한다.
// 입력 : 10
// 이진수 : 1010
// 십진수 : 10
public class ConversionEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int num = sc.nextInt();
        String arr = Integer.toBinaryString(num);
        System.out.println("2진수 : " + arr);


    }
}
