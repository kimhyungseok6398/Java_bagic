package exam_Scanner_입력;

import java.util.Scanner;

public class Ex02_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("두자리수 정수를 입력하세요");
        String input = scanner.nextLine();

        int num = Integer.parseInt(input);

        System.out.println("입력 내용" + input);
        System.out.printf("num=%d%n", num);


    }
}
