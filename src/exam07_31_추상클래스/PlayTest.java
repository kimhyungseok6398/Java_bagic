package exam07_31_추상클래스;

public class PlayTest {
    public static void main(String[] args) {
    // Player p = new PlayTest(); 구현부가 없기 때문에 객체 생성 불가
    Player ap = new AudioPlayer();
    ap.play(100);
    ap.stop();
    }
}
