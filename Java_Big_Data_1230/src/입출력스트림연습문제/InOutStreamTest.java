package 입출력스트림연습문제;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;
// 스캐너로 라인별로 문자열을 읽어 들임
// 입력받은 문자열을 공백 기준으로 자르고 이를 문자열 배열에 대입 (요소가 4개인 배열이 생성)
// 첫번째 요소는 문자열이라 변환 필요 없고 나머지는 연산을 위해 정수형으로 변환 필요
// ts.add(new 클래스(생성자)); 생성자에 이름과 변환된 정수값을 대입
// 향상된 for 문을 순회하면서 결과 출력
// 이름과 3개의 성적을 객체 단위로 관리하기 위해 클래스를 생성하고 정렬을 위해 Comparable 상속이나 Comparator
// Comparable 상속 받아 정렬 기준에 대한 메소드를 오버라이딩해 정렬에 대한 조건을 구현하거나 Comparator를 상속 받음
// 해당 파일을 읽어 총점을 구하고 총점이 높은 사람 순으로 이름과 총점 보여주기 (총점이 같으면 이름순)
public class InOutStreamTest {
    public static void main(String[] args) throws FileNotFoundException {
        TreeSet<Student> ts = new TreeSet<>();
        FileInputStream is = new FileInputStream("Java_Big_Data_1230/src/입출력스트림연습문제/score.txt");

        Scanner sc = new Scanner(is);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] arr = line.split(" "); //입력받은 문자열을 공백기준으로 자르고 문자열 배열에 대입

            ts.add(new Student(arr[0],Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3])));

        }
           for (Student e : ts) {
                System.out.println(e.getName() + " : " + e.getTotal());
           }
    }

}
