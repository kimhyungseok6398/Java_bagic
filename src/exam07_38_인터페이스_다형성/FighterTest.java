package exam07_38_인터페이스_다형성;

public class FighterTest {
    public static void main(String[] args) {
    //Fighter f = new Fighter();
      Fightable f = new Fighter();
    f.move(100,200);
    f.attack(new Fighter());
    }
}
