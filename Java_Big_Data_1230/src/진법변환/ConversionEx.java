package 진법변환;

import java.util.Scanner;

//문제 : 8진수가 주어졌을 때, 2진수로 변환하는 프로그램 작성
//입력 : 첫째줄에 8진수가 주어짐
//출력 : 첫째줄에 주어진 8진수를 2진수로 변환하여 출력, 수가 0인 경우를 제외하고 반드시 1로 시작
// 314 => 각자리의 수가 0 ~ 7
// 11001100
// 000 001 010 011 101 110 111
//       1  10  11 101 110 111

public class ConversionEx {
    public static void main(String[] args) {
        String[] arr = {"000","001","010","011","101","110","111"};
        String[] arr2 ={"","1","10","11","101","111"};

        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        for (int i =0; i <number.length();i++) {
            if(number.length()==1 && number.charAt(0) -'0'==0) { //0이 하나가 입력된 경우
                System.out.println("0");
                break;
            }
           if(i ==0) {
               System.out.print(arr2[number.charAt(0)-'0']);
           } else {
               System.out.print(arr[number.charAt(0)-'0']);
           }

        }

    }
}
