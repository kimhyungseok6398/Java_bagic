package exam06_2_parameter_기본형_참조형;

public class Ex06_6 {
    public static void main(String[] args) { // main 메서드가 처음으로 스텍구조에 올라감
        Data d = new Data(); // 참조변수 d 가 만들어지고 객체생성, 변수 d에 저장
        d.x = 10; // 값을 10으로 변경
        System.out.println("main() : x = " + d.x); // 10

        change(d.x); // 체인지 메서드 호출 10이 스타틱 메서드에 있는 매개변수로 복사가 됨
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }
    static void change(int x) {
        x = 1000; // 1000으로 변경
        System.out.println("change() x = " + x);
    }
}
