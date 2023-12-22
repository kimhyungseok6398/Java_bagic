package exam06_3_class_insteance_메서드;

public class TestClass {
    void instanceMethod(){} // 인스턴스 메서드
    static void staticMethod(){} //스타틱 메서드

    void instanceMethod2(){     // 인스턴스 메서드
        instanceMethod();       // 다른 인스턴스 메서드를 호출
        staticMethod();         // 스타틱 메서드를 호출
    }
    static void staticMethod2(){       // 스타틱 메서드
        // instanceMeth(); 오류 !! 인스턴스 메서드를 호출할 수 없다.
           staticMethod();             // 스타틱 메서드를 호출할 수 있다
    }
}
