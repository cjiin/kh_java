package 암호화알고리즘;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// [입력]
// nice day
// love
// 첫째줄엔 평문, 둘째 줄엔 암호화 키
// 암호화 키의 반복 :  lovelovelove => love 라는 문자열을 입력 받아 문자배열로 만듦, 문자배열의 길이는 4 (인덱스 0,1,2,3)
//                 nice day
//a b c d e f g h  i g   k  l  m  n o p q r s t u v m x y z
//1 2 3 4 5 6 7 8  9 10 11 12 13 14
// 만약 결과가 음수가 나오면 해당 값에서 26만큼 더해줌
// 평문은 알파벳 소문자와 공백으로 구성되며 암호화 키는 알파벳 소문자만으로 구성
// [출력]
// btgz oet
public class EncryptTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("평문 : ");
        String normal  = sc.nextLine(); // 평문은 공백이 있으므로 nextLine
        System.out.print("암호화 키 : ");
        String key = sc.next();
        char[] enc = key.toCharArray(); // 암호화 키를 문자 배열로 변경
        char value = 0; // 암호문을 만들기 위한 문자 변수
        List<Character> vig = new ArrayList<>();
        for(int i =0; i<normal.length();i++) {
            if(normal.charAt(i) == ' ') vig.add(' ');
            else {
                value = (char) (normal.charAt(i) - (enc[i % key.length()] - 'a') -1);
                if(value < 'a') value += 26;
                vig.add(value);
            }
        }
        for(Character e : vig) System.out.print(e);
    }
}
