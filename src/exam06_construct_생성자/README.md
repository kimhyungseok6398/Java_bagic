# 생성자

* * * 

## 생성자란?
* 인스턴스가 생성될때 마다 호출되는 '인스턴스 초기화 메서드'

## 생성자 조건
* 인스턴스 변수들을 초기화, 편리하게 하기위해
* 생성자의 이름은 클래스 이름과 같아야한다.
* 리턴값이 없다.(void 안붙힘)
* 모든 클래스는 반드시 1개 이상 생성자를 가져야 한다

## 기본 생성자
* 매개변수가 없는 생성자
* 생성자가 하나도 없을때만, 컴파일러가 자동추가

        Time t = new Time(); (Time() // 생성자)
        t.hour = 12;
        t.minute = 34;
        t.second = 56;

        == Time t = new Time(12,34,56);  (Time(12,34,56); // 생성자) 

## 인스턴스를 생성 할때는 다음의 2가지 사항을 결정해야 한다.
* 클래스 - 어떤 클래스의 인스턴스를 생성 할것인가?
* 생성자 - 선택한 클래스의 어떤생성자로 인스턴스를 생성할 것인가?
