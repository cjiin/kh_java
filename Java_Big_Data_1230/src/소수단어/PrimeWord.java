package 소수단어;

import java.util.Scanner;
// a는 1로, b는 2로, ...z는 26으로, A는 27로, ...Z는 52로 하여 그 합을 구함

public class PrimeWord {
    public static void main(String[] args) {
        int sum = 0; // 각 영어 문자를 더해서 총 합계를 만드는 변수
        boolean isPrime = true; // 소수인 상태를 기본값으로 설정
        Scanner sc = new Scanner(System.in);
        System.out.print("단어를 입력하세요 : ");
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a') sum += word.charAt(i) - 'a' + 1;
            else sum += word.charAt(i) - 'A' + 27;
        }
        //소수인지 아닌지 판별하기, 1으로 정하기로 했기 때문에 조건에서 제외
        for (int i = 2; i < sum; i++) {
            if (sum % i == 0) isPrime = false;
        }
        if (isPrime) System.out.println("It is a Prime word");
        else System.out.println("It is not Prime word");
    }
}