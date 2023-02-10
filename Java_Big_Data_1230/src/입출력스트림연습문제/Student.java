package 입출력스트림연습문제;

public class Student implements Comparable<Student>{
    private String name;
    private int kor;
    private int eng;
    private int mat;

    public Student(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    int getTotal() {
        return kor + eng + mat;
    }

    public String getName() { //접근제한자 걸어놔서 이걸로 읽어야함
        return name;
    }


    @Override
    public int compareTo(Student o) {
        if ((this.getTotal()) == (o.getTotal()))
            return this.name.compareTo(o.name); //이름 순 정렬
        return o.getTotal() - this.getTotal(); // 내림차순 (성적이 높은순 )
    }
}
