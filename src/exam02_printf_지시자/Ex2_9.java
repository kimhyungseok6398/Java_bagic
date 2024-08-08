package exam02_printf_지시자;

public class Ex2_9 {
    public static void main(String[] args) {
        String url = "www.codechobo.com";
        float f1 = .10f;
        float f2 = 1e1f;
        float f3 = 3.14e3f;
        double d = 1.23456789f;
        System.out.printf("f1=%fn, %e, %g%n", f1,f1,f1);
        System.out.printf("f2=%fn, %e, %g%n", f2,f2,f2);
        System.out.printf("f3=%fn, %e, %g%n", f2,f2,f2);
        System.out.printf("d=%f%n", d);
        System.out.printf("d=%f14.10f%n", d);
        System.out.printf("[12345678901234567890]%n");
        System.out.printf("[%s]%n", url);
        System.out.printf("[%20s]%n", url);
        System.out.printf("[%-20s]", url);
        System.out.printf("[%.8s]%n", url);



    }
}
