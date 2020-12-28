import java.util.Scanner;

public class RunTests {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int intParse;

        System.out.println("\nПрограмма для проверки тестов:\n\n1 - тест на ввод числа.\n2 - тест на ввод имени.\n3 - тест на ввод массива.\n0 - выйти из программы тестов.\n");
        while (true) {
            System.out.print("Введите номер теста: ");
            String number = scanner.nextLine();
            try {
                intParse = Integer.parseInt(number);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число!\nВведите тест номер 1,2,3 или 0\n");
                continue;
            }
            if (intParse < 0 || intParse > 3) {
                System.out.println("Такого теста нет");
                System.out.println(" ");
            } else if (intParse == 0) {
                System.out.println("Выходим....");
            } else {
                System.out.printf("Вы выбрали тест № %d \n", intParse);
            }
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
            if (intParse == 0) {
                break;
            }
        }
    }
}
