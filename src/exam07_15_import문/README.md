# import문

* * *

## import 문이란?
* 클래스를 사용할때 패키지 이름을 생략할 수 있다
* ctrl + Shift + o == import 문 설정


## static import문 
* static 멤버를 사용할때 클래스 이름을 생략할 수 있게 해준다.

        import static java.lang.Integer.*;
        import static java.Math.random;
        import static java.lang.System.out;


        System.out.println(Math.random());
        ==
        out.println(Math.random()); 
        // System. = 생략가능
        
