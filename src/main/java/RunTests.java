import java.util.Scanner;

public class RunTests {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int intParse;

        System.out.println("\nПрограмма для проверки тестов:\n\n1 - тест на ввод числа.\n2 - тест на ввод имени.\n3 - тест на ввод массива.\n0 - выйти из программы тестов.\n");
        while (true) {
            System.out.print("Введите номер теста: ");
            /* получение строки от пользователя */
            String number = scanner.nextLine();
            /* парсинг полученной строки на число */
            try {
                intParse = Integer.parseInt(number.trim());
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число. Введите тест номер 1,2,3 или 0\n");
                continue;
            }
            /* проверка номера теста на имеющиеся */
            if (intParse < 0 || intParse > 3) {
                System.out.println("Такого теста нет");
                System.out.println(" ");
            } else if (intParse == 0) {
                System.out.println("Выходим....");
                break;
            } else {
                System.out.printf("Вы выбрали тест № %d. \n", intParse);
            }
            /* запуск тестов в соответствии с введенным номером */
            switch (intParse) {
                case 1:
                    FirstTest.firstTest();
                    break;
                case 2:
                    SecondTest.secondTest();
                    break;
                case 3:
                    ThirdTest.thirdTest();
                    break;
            }
        }
    }
}

