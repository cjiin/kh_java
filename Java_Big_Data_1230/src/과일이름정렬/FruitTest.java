package 과일이름정렬;


import java.util.Arrays;
import java.util.Comparator;

// 임의의 과일 이름 10개의 배열 생성
// 길이 순으로 정렬하고 길이가 같은 경우 사전 (알파벳 순서)로 정렬하기
// String 의 length() : 양수, 음수
// String 의 compareTo() 를 사용
// Arrays.sort(배열이름, new Comparator<String>(){ compare()메소드를 구현 }
public class FruitTest {
    public static void main(String[] args) {
        String[] fruit = {"Mango","Kiwi","Orange", "Cherry", "Banana", "Peach",
                "Melon", "Apple", "Plum", "Watermelon"};
        Arrays.sort(fruit, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1; // 첫번째가 두번째 보다 길이가 길면 정렬조건
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2); // 두번째가 사전순으로 앞에 있으면 양수 값
                    }
                    return -1; // 현 상태 유지
                }
            }
        });
        System.out.println(Arrays.toString(fruit));

        String test ="abcd";
        System.out.println(test.compareTo("ab")); // 양수
        System.out.println(test.compareTo("abcd")); // 0
        System.out.println(test.compareTo("abcde")); // 음수
    }
}
