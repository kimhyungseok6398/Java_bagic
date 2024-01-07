package exam07_29_다형성장점_객체배열;

public class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    Product2[] cart = new Product2[10];
    int i = 0;

    void buy(Product2 p) {
        if (money < p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
            return;
        }
        money -= p.price;
        bonusPoint +=p.bonusPoint;
        cart[i++] = p;
        System.out.println(p + "을 구입하셨습니다");
    }
}
