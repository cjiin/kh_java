package 배열기본;

public class BasicArray {
    public static void main(String[] args) {
         //타입[] 참조변수 = new 타입[크기];
        int[] score = {80, 99,70};
        int sum=0;
        double avg =0.0;
        for(int i=0;i< score.length;i++) {
            sum += score[i]; // sum = sum +score[i]
        }
            avg=((double)sum/ score.length);
        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.2f\n" , avg );
    }
}
