package exam07_7_overriding;

import exam07_상속_2_포함관계.MyPoint;

public class OverridingTest {
    public static void main(String[] args) {

//        MyPoint3D p = new MyPoint3D();
//        p.x = 3;
//        p.y = 5;
//        p.z = 7;
//
//        System.out.println(p.getLocation());

        /**
         * 더 쉽게 변경
         *
         */
    MyPoint3 p = new MyPoint3(3,5);
   // p.x = 3; 생성자 생성으로 다른 방식 가능
   // p.y = 5;
//        System.out.println(p.x);
//        System.out.println(p.y);
// 지금 까지 이러한 방법으로 출력을 하였다면

        System.out.println(p.toString());
        // 메서드로 호출하는 방식
        System.out.println(p);
    }
}
