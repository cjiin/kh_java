package 스택코인;

import java.util.Stack;

public class StackCoin {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(500));
        coinBox.push(new Coin(10));
        while (!coinBox.empty()) { // 비어 있지 않으면
            Coin coin = coinBox.pop(); //꺼내면서 보여줌
            System.out.println("꺼내온 동전 : " + coin.getValue()); // 맨 위에서 부터 꺼냄 (10부터)
        }
    }

}

class Coin {
    private int value;

    public Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
