package exam07_27_매개변수_다형성;

import exam07_23_다형성.Tv;

public class Tv1 extends Product{
    Tv1(){
        super(100);
    }
    public String toString(){
        return "TV";
    }
}
