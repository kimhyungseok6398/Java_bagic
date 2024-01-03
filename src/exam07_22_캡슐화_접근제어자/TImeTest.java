package exam07_22_캡슐화_접근제어자;

public class TImeTest {
    public static void main(String[] args) {
     Time t = new Time();
    // t.hour = 100;
     t.setHour(21);  // hour의 값을 21로 변경
     System.out.println(t.getHour());

     t.setHour(100);
     System.out.println(t.getHour());
    // 조건문으로 그 값 안에서만 변경이 가능 하도록 설정하였기에
    // 100을 넣어도 21이 출력
    }
}
