package 스트림예제4;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

// 파일로부터 스트림 얻기
public class StreamEx4 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("Java_Big_Data_1230/src/스트림예제4/chicken.txt");
        Stream<String> stream = Files.lines(path, Charset.defaultCharset());
        stream.forEach(System.out::println);
        System.out.println();
    }
}
