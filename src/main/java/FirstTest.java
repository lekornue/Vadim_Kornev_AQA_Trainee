import java.math.BigInteger;

public class FirstTest extends RunTests {

    public static void firstTest() {

        while (true) {
            System.out.println("\nВВЕДИТЕ ЛЮБОЕ ЧИСЛО:\n");
            String number = scanner.nextLine();
            BigInteger intParse;
            BigInteger minvalue = BigInteger.valueOf(7);
            try {
                intParse = new BigInteger(number.trim());
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не число! \n");
                continue;
            }
            System.out.printf("Вы ввели: %d \n", intParse);

            if (intParse.compareTo(minvalue) > 0) {
                System.out.println("Привет");
            } else {
                System.out.println("Не Привет");
            }
            System.out.println(" ");
            System.out.println(" ");
            break;
        }
    }
}

