package exam07_상속;

public class Tv {

   boolean power;
   int channel;
   void power(){
       power = !power;
   }
   void channelUp(){
       ++channel;
   }
   void channelDown(){
       --channel;
   }


}
