import java.math.BigInteger;
import java.util.ArrayList;

public class ThirdTest extends RunTests {

    public static void thirdTest() {
        ArrayList<BigInteger> array = new ArrayList<>();
        BigInteger number;

        System.out.println("\nВВЕДИТЕ ЧИСЛА МАССИВА ЧЕРЕЗ ПРОБЕЛ ИЛИ ЧЕРЕЗ НАЖАТИЕ НА ENTER.\nЧТОБЫ ЗАВЕРШИТЬ, ВВЕДИТЕ ЛЮБОЕ ЗНАЧЕНИЕ 'НЕ ЧИСЛО' И НАЖМИТЕ ENTER.\n");
        while (scanner.hasNextBigInteger()) {
            number = scanner.nextBigInteger();
            array.add(number);
        }

        scanner.next();
        scanner.nextLine();

        System.out.println("Исходный массив :");

        for (BigInteger integer : array) {
            System.out.print(integer + " ");
        }
        System.out.println(" ");
        System.out.println("Значения массива кратные трем : ");

        for (BigInteger integer : array) {
            if (integer.intValue() % 3 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}
