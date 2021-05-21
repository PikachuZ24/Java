import java.util.ArrayList;
import java.util.Scanner;

public class Lab_3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {

                /* ИНИЦИАЛИЗАЦИЯ И ВВОД МАССИВА */
                System.out.println("Для выхода из программы введите любой не числовой символ/последовательность символов");
                System.out.println("Введите размерность массива m на n: ");
                System.out.print("m= ");
                int m = scanner.nextInt();
                System.out.print("n= ");
                int n = scanner.nextInt();
                int array[][] = new int[m][n];
                boolean res[] = new boolean[m];
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        array[i][j] = scanner.nextInt();
                    }
                }


                /*ВЫВОД МАССИВА*/
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(" " + array[i][j] + " ");
                    }
                    System.out.println("");
                }

                for (int i = 0; i < m; i++)
                {
                    int eq = 0;
                    boolean[] visited = new boolean[n];
                    for (int j = 0; j < n; j++)
                    {
                        if (visited[j])
                            continue;
                        visited[j] = true;
                        int buff = array[i][j];
                        boolean eq_bool = false;
                        for (int k = 0; k < n; k++)
                        {
                            if (k != j && buff == array[i][k] && !visited[k])
                            {
                                eq_bool = true;
                                visited[k] = true;
                                //break;
                            }

                        }
                        if (eq_bool)
                            eq++;

                    }
                    if (eq >= 2)
                    {
                        res[i] = true;
                    }
                }


                for (int i = 0; i < m; i++)
                {
                    if (res[i])
                        System.out.println(i + 1 + " строка имеет 2 или больше одинаковых элементов");
                    else
                        System.out.println(i + 1 + " строка не имеет 2 или больше одинаковых элементов");

                }
            }
        } catch (Throwable t){
            System.out.println("Вы вышли из программы, спасибо за использование и хорошего дня =)");
        }
    }
}
