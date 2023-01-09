package 상근날드;
// 상근날드 가게에서는 세트 메뉴를 판매
// 햄버거는 3가지 종류가 있고 음료는 2가지 종류가 있음
// 입력은 총 5개의 값을 연속으로 입력하는데 햄버거 3가지, 음료 2가지의 가격을 연속으로 입력 01234
// 햄버거 3가지 중 가장 싼 메뉴 선택, 음료 2중 가장 싼 것 선택하고 , 세트메뉴이기 때문에 50원 할인
// 총 세트 메뉴의 금액을 구하는 문제

import 제일큰값찾기.MaxValue;

import java.util.Scanner;

public class SetMenu {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] hamburger = new int[3];
//        int[] drink = new int[2];
//
//        for (int i = 0; i < hamburger.length; i++) {
//            hamburger[i] =sc.nextInt();
//            }
//        for(int i=0;i < drink.length; i++) {
//            drink[i]=sc.nextInt();
//
//        }
//        System.out.println((Math.min(hamburger[0],Math.min(hamburger[1],hamburger[2]))+Math.min(drink[0],drink[1]))-50+"원");

        int[] menu = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("메뉴 입력 : ");
        for(int i = 0; i<menu.length; i++ ) {
            menu[i] =sc.nextInt(); //배열의 길이만큼 순회하면서 값을 연속으로 입력 받음
        }
        int minBurger = menu[0]; //0~2 인덱스 사이의 햄버거 중 하나의 값을 기본값으로 설정
        int minDrink = menu[3]; // 3~4 인덱스 사이의 음료 중 하나의 값을 기본값으로 설정
        for(int i =0; i<menu.length; i++) {
            if((i < 3) && (minBurger > menu[i])) minBurger= menu[i];
            if((i > 2) && (minDrink > menu[i])) minDrink = menu[i];
        }
        System.out.println(minBurger+minDrink - 50 );


    }
}