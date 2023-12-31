package exam07_10_super;

public class Child extends Parent{

  int x = 20;

  void method(){
      System.out.println("x="+ x);
      System.out.println("this="+ x);
      System.out.println("super="+ x);
  }
}
