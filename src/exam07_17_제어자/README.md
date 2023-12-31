# 제어자 (형용사)

* * * 

## 제어자란?
* 클래스와 클래스의 멤버(멤버 변수, 메서드)에 부가적인 의미 부여



## 접근제어자
*  public, protected, default, private



## 그외
* static, final, abstract, native, transient, synchronized, volatile, strictfp


## static(멤버변수)
* 멤버변수,메서드에 붙일 수 있다.
* 멤버변수 모든 인스턴스에 공통적으로 사용되는 클래스 변수가 된다
* 클래스 변수는 인스턴스를 생성하지 않고도 사용 가능하다
* 클래스가 메모리에 로드될때 생성된다


## static(메서드)
* 인스턴스를 생성하지 않고도 호출이 가능한 static 메서드가 된다
* static메서드 내에서는 인스턴스멤버들을 직접 사용할 수 없다.


## final 
* 마지막의, 변경될 수 없는


## final(클래스)
* 변경될 수 없는 클래스, 확장될 수 없는 클래스가 된다.
* 그래서 final로 지정된 클래스는 다른 클래스의 조상이 될 수 없다.
* Ex) String(보안), Math(static 메서드 집합)

        final class FinalTest{    // 조상이 될 수 없는 클래스
        final int MAX_SIZE = 10;  // 값을 변경할 수 없는 멤버변수(상수)

        final void getMaxSize(){  // 오버라이딩할 수 없는 메서드(변경불가)
        final int LV = MAX_SIZE;  // 값을 변경할 수 없는 지역변수(상수)
        return MAX_SIZE: } } 


## final(메서드)
* 변경될 수 없는 메서드, final로 지정된 메서드는 오버라이딩을 통해 재정의 될 수 없다.



## final(멤버변수, 지역변수)
* 변수 앞에 final이 붙으면, 값을 변경할 수 없는 상수가 된다.


## abstract - 추상의, 미완성의 


## abstract(클래스)
* 클래스내에 추상메서드가 선언되어 있음을 의미한다.


## abstract(메서드)
* 선언부만 작성하고 구현부는 작성하지 않은 추상 메서드임을 알린다.

        abstract class AbstaractTest(){     // 추상클래스(추상메서드를 포함한 클래스)
        abstract void move();       // 추상메서드(구현부가 없는 메서드)

        AbstaractTest a = new AbstaractTest;    // 에러. 추상클래스의 인스턴스 생성불가