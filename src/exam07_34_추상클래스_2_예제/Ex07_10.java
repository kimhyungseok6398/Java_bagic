package exam07_34_추상클래스_2_예제;

public class Ex07_10 {
    public static void main(String[] args) {
    Unit [] group = {new Marine(),new Tank(), new Dropship()};

    for (int i = 0; i<group.length;i++)
   group[i].move(100,200);
    }
    }
