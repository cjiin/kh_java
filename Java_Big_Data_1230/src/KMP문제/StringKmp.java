package KMP문제;

import java.util.Scanner;

// 입력 : Knuth-Morris-Pratt
// 출력 : KMP
// 입력: Mirko-Slavko
// 출력 : MS

public class StringKmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        String str = sc.next();
        // 첫번째 방법 : split()
        String[] name = str.split("-");
        for (String e : name) System.out.print(e.charAt(0));
    }
}

// 두번째 방법 : 대문자만 골라내는 방법
//       for(int i =0; i<str.length();i++) {
//           if(str.charAt(i) >= 'A' && str.charAt(i) <='Z'); {
//           System.out.print(str.charAt(i));


// 세번째 방법 : 0번째 문자 출력, '-' 다음 문자 출력
//       for(int i = 0; i < str.length();i++) {
//           if(i==0) System.out.print(str.charAt(i));
//           else {
//               if(str.charAt(i)== '-') System.out.print(str.charAt(i+1));
//           }
//       }
// 네번째 방법 : 문자배열로 변경 후 대문자 골라내기
//        char[] chName = str.toCharArray();
//        for( char e : chName) {
//            if(e>='A' && e<= 'Z') System.out.print(e);
//        }
//    }
//
//}
