package exam06_3_class_insteance_메서드;

public class Ex06_9 {
    public static void main(String[] args) {
    System.out.println(MyMath2.add(200l,100l));
    System.out.println(MyMath2.subtract(200l,100l));
    System.out.println(MyMath2.multiply(200l,100l));
    System.out.println(MyMath2.divide(200l,100l));

    MyMath2 mm = new MyMath2();
    mm.a = 200l;
    mm.b = 100l;

    System.out.println(mm.add());
    System.out.println(mm.subtract());
    System.out.println(mm.multiply());
    System.out.println(mm.divide());
    }
}