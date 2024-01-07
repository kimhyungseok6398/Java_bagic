package exam07_29_다형성장점_객체배열;

public class Product2 {
    int price;
    int bonusPoint;

    Product2(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
    Product2(){}
}
