package exam06_class_insteance_변수;

public class Ex06_3 {
        public static void main(String[] args) {
            System.out.println("card.width = " + Card.width);
            System.out.println("card.height = " + Card.height);

            Card c1 = new Card();
            c1.kind = "Heart";
            c1.number = 7;

            Card c2 = new Card();
            c2.kind = "Spade"; 
            c2.number = 4;

            System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 , 크기는 (" + c1.width + "," + c1.height + ")");
            System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며 , 크기는 (" + c2.width + "," + c2.height + ")");

            System.out.println("c1을 바꾸겠습니다!");

            c1.width = 50;
            c1.height = 80;

            System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며 , 크기는 (" + c1.width + "," + c1.height + ")");
            System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며 , 크기는 (" + c2.width + "," + c2.height + ")");

        }
    }



