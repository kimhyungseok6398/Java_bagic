package exam07_24_참조변수_형변환_다형성_1;

public class Ex7_7 {
    public static void main(String[] args) {
    Car car = null;
    FireEngine fe = new FireEngine();
    FireEngine fe2 = null;

    fe.Water();
    car = fe; // 자손에서 조상으로 형변환 (생략가능)
    // car.water // car 참조변수로는 water 를 호출 할 수 없다. (없기 때문에)
        fe2 = (FireEngine) car; // 조상타입 -> 자손으로 형변환(형변환 생략불가)
        fe2.Water(); // 이제 호출 가능



    }
}