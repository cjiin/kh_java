package 클래스정렬예제1;

//  자동차 연식으로 정렬하기

public class CarSort implements Comparable<CarSort> {
    String modelName;
    int modelYear;
    String color;

    public CarSort(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    public int compareTo(CarSort o) {
        if(this.modelYear == o.modelYear) {
            return this.modelName.compareTo(o.modelName); // 사전 순 정렬, 비교대상인 매개변수보다 크면 (뒤에 있으면) 양수가 나옴(뒤집음)
        }
        return this.modelYear - o.modelYear;   // 앞이 뒤보다 크면 정렬 (오름차순)
    }
}
