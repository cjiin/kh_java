package 비트연산자;
//비트 연산자 : 비트 단위로 연산을 수행 (1과0)
// & (비트 AND) : 두개의 비트가 모두 1이면 1
public class BitOperator {
    public static void main(String[] args) {
        int num1 = 10; //1010
        int num2 = 12; //1100
        System.out.println(num1 & num2); // 1000 = 8
        System.out.println(num1 | num2); // 1110 = 14
        System.out.println(num1 ^ num2); // 0110 = 6
        System.out.println(~num1); // -11
        System.out.println(num1 << 1); // 00010100 = 20
        System.out.println(num1 >> 1); // 00000101 = 5


    }
}
