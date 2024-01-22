package exam07_38_인터페이스_다형성;

public interface Fightable {
    void move(int x, int y);
    void attack(Fightable f);
}
