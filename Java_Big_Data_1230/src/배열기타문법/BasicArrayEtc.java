package 배열기타문법;

import java.util.Arrays;

public class BasicArrayEtc {
    public static void main(String[] args) {
     if(args.length !=2) {
         System.out.println("외부에서 전달하는 값이 없어 강제종료합니다.");
         System.exit(0); //프로그램을 강제종료시킴
     }
        String val1 = args[0];
        String val2 = args[1];
        int num1 = Integer.parseInt(val1); //입력받은 문자열을 정수로 변환
        int num2 = Integer.parseInt(val2);
        System.out.println("외부에서 전달하는 값 : " + (num1 + num2));
    }
}
