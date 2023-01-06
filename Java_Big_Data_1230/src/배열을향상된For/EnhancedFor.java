package 배열을향상된For;
//향상된 for문은 배열의 요소를  처음부터 끝까지 자동 순회
// 배열의 내부의 값을 변경 할 수 없음
public class EnhancedFor {
    public static void main(String[] args) {
        int[] score = {80, 99,70};
        int sum=0;
        double avg =0.0;
        for(int e : score) {
            sum += e;
        }
        avg=((double)sum/ score.length);
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n" , avg );
    }
}
