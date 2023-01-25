package 인터페이스활용;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Buy buyer = customer; // Customer 타입의 customer 참조변수를 Buy 인터페스형 buyer 참조변수에 대입 (형변환)
        buyer.buy();    // buyer는 Buy 인터페이스의 메소드만 호출가능
        buyer.order(); // 재정의된 메소드가 호출 됨.

        Sell seller = customer; // 자동형변환이 일어남
        seller.sell();
        seller.order();

        Customer customer1 = (Customer) seller; // 다시 역으로 형변환 (다운 캐스팅)
        customer1.buy();
        customer1.sell();

    }
}
