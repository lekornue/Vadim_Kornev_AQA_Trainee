
public class FirstTest extends RunTests {

    public static void firstTest() {

        int intParse;

        while (true) {
            System.out.print("Введите число: ");
            String number = scanner.nextLine();
            try {
                intParse = Integer.parseInt(number);
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число! \n");
                continue;
            }
            System.out.printf("Вы ввели: %d \n", intParse);

            if (intParse > 7) {
                System.out.println("Привет");
            } else {
                System.out.println("Не Привет");
            }
            System.out.println(" ");
            break;
        }
    }
}

