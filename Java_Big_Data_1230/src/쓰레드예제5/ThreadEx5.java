package 쓰레드예제5;
// 쓰레드간의 협업 : wait(), notify(), notifyAll() 개념은 알되 안씀
// wait() : 현재의 쓰레드를 일시정지 상태로 전환 시킴
// notify() : 일시정지 상태에 있는 쓰레드를 실행 대기 상태로 전환 시킴
// notifyAll() : 일시정지 된 모든 쓰레드를 실행 대기로 만듦

public class ThreadEx5 {
    public static void main(String[] args) {
        WorkObject shareObject = new WorkObject();
        ThreadA thA = new ThreadA(shareObject);
        ThreadB thB = new ThreadB(shareObject);
        thA.start();
        thB.start();

    }
}
