package 더하기싸이클;
// 문제 : 입력 받은 수가 더하기 사이클의 조건을 수행하고 몇번만에 입력한 수와 같은 값으로 돌아오는 지 확인
// 입력 26 => 10의 자리수(2), 1의 자리 수 (6)을 분리해서 더함 => 2 + 6 = 8
// 입력 받은 수의 1의 자리 수와 계산된 수의 1의 자리 수로 다시 연산 => 68
// ----------여기까지 1 싸이클 ---------------
// 68 => 6 + 8 = 14
// 계산된 수는 84
// ------------- 2 싸이클 ---------------
// 84 => 8 + 4 = 12
// 계산된 수는 42
// ------------ 3 싸이클 -----------------
// 42 => 4 + 2 = 6
// 계산된 수는 26
// 입력 : 첫째 줄에 n이 주어진다. n은 0보다 크거나 같고 99보다 작거나 같은 정수.
// 출력 : n의 사이클 길이 출력
import java.util.Scanner;

public class SumCycle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int input = sc.nextInt();
        int num = input; // 입력 받은 값이 변경되는 걸 막기 위해 임시 값을 만듦

        int cnt = 0; // 싸이클 횟수 누적
        int sumNum = 0; // 입력 받은 수의 10의 자리와 1의 자리를 분리해서 더함 .42
        int newNum = 0; // 새롭게 만들어진 수

        while(true) {
            sumNum = (num / 10) + (num % 10);
            newNum = ((num % 10) * 10) + (sumNum % 10); //입력값의 1의 자리 + 계산된 값의 1의 자리 더함
            cnt++;
            if(newNum == input) break; //더하기 조건에 따라 1 사이클 순회 후 입력 받은 값 비교
            num = newNum; // 순회를 위해 만들어진 값을 순회용 변수에 대입

        }
        System.out.println(cnt);

    }
}
