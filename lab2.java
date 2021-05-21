import java.util.Scanner;

import static java.lang.Math.*;

public class lab2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();

        double y;
        if (x <= -0.5) {
            y = pow(-x, 5) + log10(abs(pow(3, x) - pow(abs(x), -x)));
        } else if ((x > -0.5) & (x < 0.5)) {
            y = tan(x / (1 - pow(x, 2)));
        } else {
            y = acos(1 / 4 * x);
        }


        System.out.println(y);

    }
}
