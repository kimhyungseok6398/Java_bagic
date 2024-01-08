package exam07_34_추상클래스_2_예제;

public class Dropship extends Unit{

    @Override
    void move(int x, int y) {
        System.out.println("Dropship[ x =" + x + ",y=" + y + "]");
    }
    void load(){}
    void unload(){}
}
