package 피타고라스정리;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        ArrayList<String> rstList = new ArrayList<>();
        String rst;
        while (true) {
            rst = calcFunc();
            if (rst.equals("exit")) break;
            rstList.add(rst);
        }
        for (String e : rstList) System.out.println(e);
    }


    static String calcFunc() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        if (sum == 0) return "exit";
        Arrays.sort(arr); // 오름차순 정렬 (어떻게 입력받던 맨 뒤의 값이 크게 됨)
        if ((arr[2] * arr[2]) == (arr[0] * arr[0]) + (arr[1] * arr[1])) {
            return "right";
        }
        return "wrong";
    }
}