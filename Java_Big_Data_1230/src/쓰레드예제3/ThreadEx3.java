package 쓰레드예제3;

import java.awt.*;

import static java.lang.Thread.sleep;

// sleep() : 실행 중인 쓰레드를 지정한 시간 동안 대기 상태로 만듦 (반복 수행에 대한 시간을 늦추고자 하거나, 인터럽트 예외처리를 위해 사용)
public class ThreadEx3 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i = 0; i < 10; i++) {
            toolkit.beep();
            try {
                sleep(3000);
            } catch(InterruptedException e) {

            }
        }
    }
}
