package 자동차만들기;

import java.util.Scanner;


public class CarMain {
    public static void main(String[] args) {

        Car car = null;
        int oil = 0;
        int[] location = {0,400,200,150,300};

        Scanner sc = new Scanner(System.in);
        System.out.print("이동지역 선택하세요 : [1]부산 [2]대전 [3]강릉 [4]광주 : ");
        int area = sc.nextInt();
        System.out.print("이동할 승객수 입력 : ");
        int personCnt = sc.nextInt();
        System.out.print("이동차량 선택하세요 : [1]스포츠카 [2]자동차 [3]버스 : ");
        int selectCar = sc.nextInt();
        switch (selectCar){
            case 1 : car = new SprotsCar("스포츠카");break;
            case 2 : car = new Sedan("자동차");break;
            case 3 : car = new Bus("버스");break;
            default:
        }
        System.out.print("부가가능의 ON/OFF 선택 하세요 [1]ON [2]OFF : ");
        int selectON = sc.nextInt();
        if(selectON == 1){
            car.addON(true);
        }else if (selectON ==2){
            car.addON(false);
        }

        car.result(location[area],personCnt);

    }
}