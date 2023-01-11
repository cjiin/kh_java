package TV만들기;

public class TvMain {
    public static void main(String[] args) {
        TV samsungTv = new TV();
        TV lgTv = new TV(true,59,15); //매개변수가 있는 생성자
        samsungTv.getTV();
        lgTv.getTV();

        samsungTv.setON(true);
        samsungTv.setChannel(130);
        samsungTv.setVolume(30);
    }
}
