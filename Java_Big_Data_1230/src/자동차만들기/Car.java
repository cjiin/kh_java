package 자동차만들기;


abstract class Car {
    //속도
    int speed;
    //연비
    int mpg;
    //연료탱크 크기
    int fuelSize;
    //좌석수
    int seatCnt;
    //차량이름
    String name;
    Car(String name){
        this.name = name;
    }


    //부가기능
    abstract void addON(boolean onOff);



    void result(int totalKM , int personCnt){
        int money;
        int driveCnt ;

        if(seatCnt<personCnt){
            if(personCnt % seatCnt > 0) {
                driveCnt = (personCnt / seatCnt) + 1;
            }else{
                driveCnt = (personCnt / seatCnt);
            }
        }
        else{
            driveCnt = 1;
        }
        //이동에 필요한 비용 출력
        // 총거리 / 연비 * 2000
        money =(totalKM /mpg) * 2000 * driveCnt;
        System.out.println("이동의 필요한 총비용 : " +  money);
        //주유 횟수

        int oilCnt = 0;
        int totalOil = (totalKM/mpg) * driveCnt;
        //주유 횟수

        if(totalOil % fuelSize > 0){
            oilCnt = totalOil / fuelSize + 1;
        } else {
            oilCnt = totalOil / fuelSize;
        }

        System.out.println("주유횟수 : " +  oilCnt );
        //총시간 계산
        System.out.printf("총시간 계산식 : %.2f 시간" , (double)totalKM * driveCnt /speed);


    }

}

//스포츠카
class SprotsCar extends Car {

    SprotsCar(String name) {
        super(name);
        speed =250;
        fuelSize =30;
        mpg=8;
        seatCnt = 2;
    }


    @Override
    void addON(boolean onOff) {
        if(onOff) speed =(int)(speed * 1.2);
    }

}

class Sedan extends Car{
    boolean isTrunk =false;

    Sedan(String name) {
        super(name);
        speed =200;
        fuelSize =45;
        mpg=12;
        seatCnt = 4;
    }

    @Override
    void addON(boolean onOff) {
        //승객수 추가
        if(onOff) seatCnt +=1;
    }


}

class Bus extends Car{

    Bus(String name) {
        super(name);
        speed =150;
        fuelSize =100;
        mpg= 5;
        seatCnt = 20;
    }

    @Override
    void addON(boolean onOff) {
        if(onOff) fuelSize +=30;
    }

}
//