package exam07_38_인터페이스_다형성;

abstract public class Unit2 {
    int x,y;

    abstract void move(int x, int y);
    void stop(){
        System.out.println("멈춥니다");
    }
}
