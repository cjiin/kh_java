package 구간의합;

import java.util.Scanner;

// 첫째 줄엔 수의 개수 (배열의 길이), 합을 구해야 하는 횟수가 주어짐
//5 3
//5 4 3 2 1
//1 3
//2 4
//5 5
public class RangeBasicEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }

        int left = 0, right = 0;

        while (cnt !=0) {
            long sum = 0;
            left = sc.nextInt();
            right = sc.nextInt();
            for (int i = left - 1; i < right; i++) {
                sum += arr[i];

            }
            System.out.println(sum);
            cnt--;
        }
    }
}
