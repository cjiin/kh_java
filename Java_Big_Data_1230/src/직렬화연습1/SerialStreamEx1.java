package 직렬화연습1;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// 객체 직렬화란? 프로그램에서 사용되는 객체를 파일이나 네트워크로 전송하기 위해서 연속죽적인 바이트 형태로 변경하는 것
// 직렬화된 바이트를 객체로 복원하는 것은 역직렬화
public class SerialStreamEx1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeList();
        List<Board> list = readList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Board e : list) {
            System.out.println("번호 : " + e.getNumber());
            System.out.println("제목 : " + e.getTitle());
            System.out.println("내용 : " + e.getContent());
            System.out.println("작가 : " + e.getWriter());
            System.out.println("시간 : " + sdf.format(e.getDate()));
            System.out.println("--------------------------------------");
        }

    }
    static void writeList() throws IOException { // 객체에 대한 직렬화
        List<Board> list = new ArrayList<>();
        list.add(new Board(1,"일타스캔들","로맨틱코미디","유제원",new Date()));
        list.add(new Board(2,"대행사","오피스드라마","이창민",new Date()));
        list.add(new Board(3,"재벌집막내아들","경제드라마","정대윤",new Date()));

        FileOutputStream fos = new FileOutputStream("board.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list); // 객체 출력 스트림을 이용해 list 출력
        oos.flush(); // write 이후에는 반드시 flush - 시험문제에 나옴
        oos.close();

    }


    static List<Board> readList() throws IOException, ClassNotFoundException { // 역직렬화
        FileInputStream fis = new FileInputStream("board.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Board> list = (List<Board>) ois.readObject(); // 파일의 바이너리를 list 형태로 역직렬화
        return list;
    }
}
