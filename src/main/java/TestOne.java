import java.util.Scanner;

public class TestOne {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: \n");
        if (in.hasNextInt()) {
            int num = in.nextInt();
            System.out.printf("Вы ввели: %d \n", num);
            if (num > 7) {
                System.out.println("Привет");
                in.close();
            }
        } else {
            System.out.println("Вы ввели не число! \n");
            System.out.print("Попробуйте ввести число: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                System.out.printf("Вы ввели: %d \n", number);
                if (number > 7) {
                    System.out.println("Привет");
                    scanner.close();
                }
            } else {
                System.out.println("Ну что ты будешь делать, опять не число, перезапустите программу и попробуйте снова!");
            }
        }
    }
}

