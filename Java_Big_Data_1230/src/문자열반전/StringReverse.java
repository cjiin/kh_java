package 문자열반전;

import java.util.Scanner;

//abcdefg => gfedcba
// 힌트 : for 문 이용, while 문 이용

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
//         int index = str.length();
//         while(true) {
//           index--;
//          System.out.print(str.charAt(index));
//        if (index == 0) break;
//       }
    }
}
