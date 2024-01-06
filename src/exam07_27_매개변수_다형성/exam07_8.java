package exam07_27_매개변수_다형성;

public class exam07_8 {
    public static void main(String[] args) {
Buyer b = new Buyer();
        Product p = new Tv1();
        b.buy(p);
        Product p1 = new Computer();
        b.buy(p1);

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다");
        System.out.println("현재 보너스 점수는 " + b.bonusPoint + "점입니다");
    }
}
