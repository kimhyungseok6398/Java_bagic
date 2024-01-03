package exam07_22_캡슐화_접근제어자;

public class TImeTest {
    public static void main(String[] args) {
     Time t = new Time();
    // t.hour = 100;
     t.setHour(21);  // hour의 값을 21로 변경
     System.out.println(t.getHour());

     t.setHour(100);
     System.out.println(t.getHour());

    }
}
