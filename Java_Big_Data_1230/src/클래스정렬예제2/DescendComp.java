package 클래스정렬예제2;

import java.util.Comparator;

// 정렬 방식을 정하는 클래스
public class DescendComp implements Comparator<Fruit> {
    @Override
    public int compare(Fruit o1, Fruit o2) {
        if(o1.price == o2.price) {
            return o1.name.compareTo(o2.name); // 이름순으로 오름차순 (오른쪽 게 더 크면 양수. 양수면 정렬조건이 됨)
        }
        return o2.price - o1.price; // 큰 값부터 작은 값 순서로 정렬함. 가격이 비싼 순 (내림차순)
    }

    @Override
    public Comparator<Fruit> reversed() {
        return Comparator.super.reversed();
    }
}
