# 참조변수의 형변환

* * * 

## 참조변수의 형변환
* 사용할 수 있는 멤버의 갯수를 조절하는 것
* Ex) 3.6 을 형변환 -> 3 = 값이 변경된다
* 조상 자손 관계의 참조변수는 서로 형변환 가능 
  * 형제관계끼리는 형변환 안됨

          FireEngine f = new FireEngine();  
          Car c = (Car)f;                   // 가능. 조상인 Car타입으로 형변환 (생략가능)
          FireEngine f2 = (FireEngine)c;    // 가능. 자손인 FireEngine타입으로 형변환(생략불가)
          Ambulance a = (Ambulance)f;       // 에러!! 상속관계가 아닌 클래스 간의 형변환 불가(자손끼리 불가)

* 형변환 할경우 무조건 형변환 연산자를 붙여준다고 생각하자.
* 중요!! 실제 인스턴스를 무엇으로 할지가 중요