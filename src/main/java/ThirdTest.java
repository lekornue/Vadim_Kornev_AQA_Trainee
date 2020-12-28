import java.math.BigInteger;
import java.util.ArrayList;

public class ThirdTest extends RunTests {

    public static void thirdTest() {
        ArrayList<BigInteger> array = new ArrayList<>();

        System.out.println("Вводите числа массива через пробел.");
        while (scanner.hasNextBigInteger()) {
            BigInteger number = scanner.nextBigInteger();
            array.add(number);
        }

//        String string = scanner.nextLine();
//        try {
//          int  intParse = Integer.parseInt(string);
//        } catch (NumberFormatException e) {
//            System.out.println("Вы ввели не число! Заполнение массива закончено.\n");
//        }

//        while (true) {
//            System.out.println("Вводите числа массива нажимая клавищу Enter после ввода");
//            String number = scanner.nextLine();
//            try {
//                intParse = Long.parseLong(number);
//            } catch (NumberFormatException e) {
//                System.out.println("Вы ввели не число. Заполнение массива закончено.\n");
//                break;
//            } finally {
//                array.add(intParse);
//            }
//        }
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
        scanner.nextLine();
        System.out.println(" ");
        System.out.println(" ");
    }
}
