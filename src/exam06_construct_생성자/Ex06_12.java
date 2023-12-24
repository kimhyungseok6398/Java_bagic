package exam06_construct_생성자;

public class Ex06_12 {
    public static void main(String[] args) {
    Car c1 = new Car();
    c1.color = "white";
    c1.gearType = "auto";
    c1.door = 4;

    Car c2 = new Car("white", "white",4);
    System.out.println();

    }
}