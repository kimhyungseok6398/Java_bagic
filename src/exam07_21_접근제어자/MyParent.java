package exam07_21_접근제어자;

public class MyParent {

    public  int pub;    // 접근 제한 없음
    protected int prt;  // 같은 클래스, 같은 패키지, 자손 클래스(다른 패키지)
    int dft;            // 같은 클래스, 같은 패키지

    private int prv;    //같은 클래스


    public void printMembers(){
        System.out.println(pub);
        System.out.println(prt);
        System.out.println(dft);
        System.out.println(prv);


    }
}
