package exam07_21_접근제어자;

public class MyParentTest {
    public static void main(String[] args) {
        MyParent p = new MyParent();
        System.out.println(p.pub);
        System.out.println(p.prt);
        System.out.println(p.dft);
        // System.out.println(p.prv);   // 에러!! 같은 클래스만 접근 가능
    }
}
