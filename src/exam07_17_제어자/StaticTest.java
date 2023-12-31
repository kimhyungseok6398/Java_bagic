package exam07_17_제어자;

public class StaticTest {
    static int width = 100;
    static int height = 120;

    static {}   // static변수의 복잡한 초기화 수행( 클래스 초기화 블록 )

    static int max(int a, int b){      // 클래스 메서드(static메서드)
        return a > b ? a: b;
    }
}

