package exam06_3_class_insteance_메서드;

public class TestClass2 {
    int iv;
    static int cv;

    void instanceMethod(){      // 인스턴스 메서드
        System.out.println(iv); // 인스턴스 변수를 사용할 수 있다
        System.out.println(cv); // 클래스 변수를 사용할 수 있다.
    }
    static void staticMethod(){     // static 메서드
        // System.out.println(iv); 에러 // 인스턴스 변수를 사용할 수 없다, (객체가 생성되야 사용가능한데 객체가 있을지 모르기 때문)
        System.out.println(cv);     // 클래스 변수를 사용할 수 없다.
    }
}
