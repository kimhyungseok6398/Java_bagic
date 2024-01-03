package exam07_23_다형성;

public class Ex01 {
    public static void main(String[] args) {
        SmartTv t1 = new SmartTv();
        // 멤버 7개 모두 접근가능

        Tv t2 = new SmartTv();
        // Tv에 있는 멤버 5개만 접근 가능
    }
}
