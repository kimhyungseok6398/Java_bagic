package exam10_calender;

import java.util.Calendar;

public class Ex10_1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
        System.out.println("월 (0~11, 0:1월): )" + today.get(Calendar.MONTH));
        System.out.println("이 해의 몇 째주 : " + today.get(Calendar.WEEK_OF_YEAR));

        System.out.println("이해의 몇째 주 : " + today.get(Calendar.MONTH));

        // DATE와 DAY_OF_MONTH는 같다.
        System.out.println("------");

        }
    }

