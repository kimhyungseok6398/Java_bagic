package exam02_연산자_증감연산자;

public class Ex03_2 {
    public static void main(String[] args) {


        int i = 5;
        int j = 0;

        j = i++;
        System.out.println("j = i++; 실행후,i = " + i + ", j = " + j);

        i = 5;
        j = 0;

        j = ++i;

        System.out.println("j = ++i ; 실행후, i=" + i + ", j= " + j);
    }
}