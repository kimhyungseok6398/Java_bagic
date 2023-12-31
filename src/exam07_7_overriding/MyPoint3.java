package exam07_7_overriding;

public class MyPoint3 extends Object{
    int x;
    int y;

    public MyPoint3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //    String getLocation(){
//        return "x:"+ x + " , y: " + y;
//}
    /**
     * 더 쉽게 설정
     * Object쿨래스의 tostring()을 오버라이딩
     */
    public String toString(){ // 오버라이딩을 할려면 접근제어자가 같아야한다
        return "x:"+x+", y:"+y;

    }
}


