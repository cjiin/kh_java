package 큐예제;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Queue : FIFO (First in First out) 구조, LinkedList 구조를 사용하고 있으며, LinkedList 기능 중 큐 관련 기능으로 제한 됨.
// add(e) : 맨 뒤에 요소를 삽입 ( 중간 삽입 안됨) - 예외 발생
// offer(e) : 맨 뒤에 요소를 삽입 - 삽입할 수 없는 상황에선 false 반환
// remove() : 맨 앞의 요소 제거(꺼냄) - 예외 발생
// poll() : 맨 앞의 요소 제거(꺼냄) - 비어 있으면 null 반환
// element() : 맨 앞의 요소 읽어 옴 - 예외 발생
// peek() : 맨 앞의 요소를 읽어 옴 - 큐가 비어 있으면 null 반환

public class QueueEx1 {
    public static void main(String[] args) {
        Queue<Message> msgQ = new LinkedList<>();
        msgQ.offer(new Message("Mail","카즈하"));
        msgQ.add(new Message("SMS","안유진"));
        msgQ.offer(new Message("KaKao", "윈터"));
        while (!msgQ.isEmpty()) {
            Message msg = msgQ.poll(); //큐에서 한개의 메시지를 꺼냄 (맨 앞 요소부터)
            switch (msg.command) {
                case "Mail" :
                    System.out.println(msg.to + "에게 메일을 보냅니다.");
                    break;
                case "SMS" :
                    System.out.println(msg.to + "에게 문자를 보냅니다.");
                    break;
                case "KaKao" :
                    System.out.println(msg.to + "에게 카톡을 보냅니다.");
                    break;
            }
        }
    }
}

class Message {
    String command;
    String to; //누구에게

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
