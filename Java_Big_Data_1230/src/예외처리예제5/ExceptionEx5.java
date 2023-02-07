package 예외처리예제5;

import java.io.FileWriter;
import java.io.IOException;

// finally : 프로그램 실행 도중 예외가 발생할 가능성이 있는 코드에 try 구문을 걸게 되는데,
// 이 때 예외가 발생라면 catch 구문으로 진행하고 그렇지 않으면 아래의 코드가 실행 됩니다.
// 이 경우 예외 여부에 상관 없이 항상 실행되어야할 구문이 있다면 finally 로 처리
public class ExceptionEx5 {
    public static void main(String[] args) {
        FileWriter f = null;
        try {
            f = new FileWriter("test.txt");
            f.write("test");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(f !=null) {
                try {
                f.close();
            } catch(IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}