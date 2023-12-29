package exam07_상속;

public class Ex7_1 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);

        stv.displayCation("Hello World");
        stv.caption = true;
        stv.displayCation("Hello, World");
    }
}