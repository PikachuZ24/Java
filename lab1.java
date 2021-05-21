import static java.lang.Math.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = sc.nextInt();

        double a = Math.cos(Math.pow(Math.abs(x), 1 / 3));
        double b = Math.pow(a, 2) + 7;
        double c = Math.asin(a / b);

        double d = Math.pow(2, x) + Math.pow(Math.abs(x), 2 * Math.tan(x));

        double e = Math.pow(Math.log10(d), 5);

        double f = Math.abs(c + e);
        double y = Math.sqrt(f);
        System.out.println("x(y) = " + y);

        System.out.println((y <= 1 * x + Math.sqrt(8)) && (y >=  1 * x - Math.sqrt(8)) && (y >= -1 * x - Math.sqrt(8)) && (y <= -1 * x + Math.sqrt(8)));


        sc.close();
    }
}

