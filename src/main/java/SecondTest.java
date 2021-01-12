
public class SecondTest extends RunTests {

    public static void secondTest() {

        System.out.println("\nВВЕДИТЕ ИМЯ:\n");
        String name = scanner.nextLine().toLowerCase();
        System.out.println("Вы ввели имя: " + name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase());
        if (name.equals("вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
        System.out.println(" ");
        System.out.println(" ");
    }
}
