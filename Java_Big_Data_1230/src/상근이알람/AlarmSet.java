package 상근이알람;
// 상근이라는 친구는 매일 학교에 지각함.
// 창영이라는 친구가 상근이에게 지각하지 않는 방법을 알려줍니다.
// 시간을 설정하면 자동으로 45분 일찍 알람이 울리도록 시간이 설정되게 함.
// 24시간제

import java.util.Scanner;

public class AlarmSet {
    public static void main(String[] args) {
        // 시간을 입력받기 위해 스캐너 개체 생성
        // 생성된 객체로 시간과 분을 입력 받음 (24시간제)
        // 변수를 한 개 만들어서 입력 받은 시간과 분을 모두 분으로 환산 시간*60
        // 고려사항 : 환산한 시간이 45분 보다 적으면 별도의 계산이 필요
        // 창영이가 알려준 방법대로 시간을 45분 이전으로 돌림 ( 45를 빼줌)
        // 계산 결과를 시간과 분으로 출력하기 위해 다시 변환 후 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력하세요 : ");
        int hour = sc.nextInt();
        System.out.print("분을 입력하세요 : ");
        int min = sc.nextInt();
        int calc = (hour * 60) + min;

        if(calc <45){
            calc= (24 * 60) + min;
        }
        calc -= 45;
        System.out.printf("%d시 %d분",(calc/60),(calc%60)).println();
    }
}
