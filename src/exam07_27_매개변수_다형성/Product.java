package exam07_27_매개변수_다형성;

public class Product {
    int price;
    int bonusPoint;

    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10);

    }

}
