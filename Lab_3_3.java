import java.util.Scanner;

public class Lab_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            while (true) {

                /* ИНИЦИАЛИЗАЦИЯ И ВВОД МАССИВА */
                System.out.println("Для выхода из программы введите любой не числовой символ/последовательность символов");
                System.out.println("Введите размерность массива m: ");
                System.out.print("m= ");
                int m = scanner.nextInt();
                int array[] = new int[m];

                for (int i = 0; i < m; i++) {
                    array[i] = scanner.nextInt();

                }


                /*ВЫВОД МАССИВА*/
                for (int i = 0; i < m; i++) {
                    System.out.print(" " + array[i] + " ");
                }
                System.out.println("");

                for (int i = 0; i < m; i++)
                {
                    if (array[i] == 0)
                    {
                        boolean exit = true;
                        for (int j = i + 1; j < m; j++)
                        {
                            if (array[j] != 0) {
                                exit = false;
                                break;
                            }
                        }
                        if (exit)
                            break;
                        int pos = i;
                        for (int j = i + 1; j < m; j++)
                        {
                            int buff = array[j];
                            array[j] = array[j - 1];
                            array[j - 1] = buff;
                        }
                        i -= 1;
                    }
                }


                /*ВЫВОД МАССИВА*/
                System.out.println("Матрица после изменений: ");
                for (int i = 0; i < m; i++) {
                    System.out.print(" " + array[i] + " ");
                }
                System.out.println("");
            }
        } catch (Throwable t){
            System.out.println("Вы вышли из программы, спасибо за использование и хорошего дня =)");
        }
    }
}
