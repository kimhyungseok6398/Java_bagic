package exam07_38_인터페이스_다형성;

public class Fighter extends Unit2 implements Fightable{
    @Override
    public void move(int x, int y) {
        System.out.println("["+x+","+y+"]로 이동" );
    }

    @Override
    public void attack(Fightable f) {
    System.out.println(f+ "를 공격");
    }
}
