package exam07_22_캡슐화_접근제어자;

public class Time {
   private   int hour;      // 0부터 23사이에 값을 가져야함
     int minute;
     int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;
        this.hour = hour;

    }
}


