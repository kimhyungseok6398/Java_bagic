package exam07_34_추상클래스_2_예제;

public class Tank extends Unit{

    @Override
    void move(int x, int y) {
        System.out.println("Tank[ x =" + x + ",y=" + y + "]");
    }
    void changeMode(){}
}
