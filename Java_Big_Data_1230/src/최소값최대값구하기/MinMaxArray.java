package 최소값최대값구하기;

import java.util.Scanner;

// 정수값 입력
// 입력된 정수 범위의 임의의 값 입력해서 배열 생성
// 해당 배열에서 제일 작은 값과 제일 큰 값 찾기
// 정수값 입력 : 10
// 임의의 수 10개 생성, 최소값 최대값 찾기
public class MinMaxArray {
    public static void main(String[] args) {
        //키보드 입력을 위한 스캐너 생성
        // 입력 받은 변수의 크기만큼 배열 생성
        // 배열에서 제일 작은 값과 제일 큰값을 찾고 출력
        Scanner sc = new Scanner(System.in);
        System.out.print("배열 개수를 입력하세요 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // 생성된 배열의 갯수만큼 순회하면서 정수값을 입력받음
        }
        // 값을 비교하기 위해서 기준 값이 필요한데 배열 0번째 값을 기준값으로 저장
        int min = arr[0];
        int max = arr[0];

        for (int e : arr) {
            if (min > e) min = e;
            if (max < e) max = e;
//        for(int i =0; i < arr.length; i++){
//            if(min> arr[i]) min = arr[i];
//            if(max< arr[i]) max = arr[i];
        }

        System.out.println("최소값 : "+ min);
        System.out.println("최대값 : "+ max);
    }

}


