package exam07_상속;

public class SmartTv extends Tv {
   boolean caption;
   void displayCation(String text){
       if (caption){
           System.out.println(text);
       }
   }
    }

