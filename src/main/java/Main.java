import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int upperBorder = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        List<Integer> source = new ArrayList<>(size);
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            source.add(random.nextInt(upperBorder));
        }
        System.out.print("Отфильтрованный список: ");
        source.forEach(x -> System.out.print(x + " "));
        System.out.println();

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int treshold = scanner.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(treshold);
        List<Integer> filteredSource = filter.filterOut(source);

        logger.log("Выводим результат на экран");
        System.out.print("Отфильтрованный список: ");
        filteredSource.forEach(x -> System.out.print(x + " "));
        System.out.println();

        logger.log("Завершаем программу");
    }
}
