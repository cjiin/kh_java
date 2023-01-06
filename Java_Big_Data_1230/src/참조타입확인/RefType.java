package 참조타입확인;
// 참조 변수의 == (같음을 확인
public class RefType {
    public static void main(String[] args) {
        int x = 0;
        String str = null; // 참조타입의 변수가 객체를 참조하지 않는다는 의미
        int[] intArray = null;
        Integer val = null; // 0같은 값도 들어감
        int val2 = val; //NullPointException이 발생


        String name1 = "진부연";
        String name2 = "진부연";
        String name3 = new String ("진부연");
        if(name1 == name3) { //
            System.out.println("두개의 이름에 대한 참조가 같음");
        } else {
            System.out.println("두개의 이름에 대한 참조가 다름");

        }
        if(name1.equals(name3)) {
            System.out.println("두개의 이름의 내용이 같음");
        } else {
            System.out.println("두개의 이름의 내용이 다름");
        }

    }
}


