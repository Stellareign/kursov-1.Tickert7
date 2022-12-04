import java.util.Scanner; // импортировали сканнер

public class Main {
    public static void main(String[] args) {
        Afftor afftor = new Afftor("Николай", "Гоголь");
        System.out.println(afftor);
        Scanner scanner = new Scanner(System.in); // объявили переменную scanner с типом Scanner
        System.out.println("Какое число я задумала от 0 до 100?"); // печатаем первый запрос
        double number = scanner.nextDouble(); // считываем запрос (задан тип переменной, вводимой в запрос)
        while (number != 56) {
            System.out.println("Не угадали!");
            break;
        }
        if (number == 56) {
            System.out.println("Ура! Угадали!");
        }
        main(args);
    }
} // перенос в другую ветку