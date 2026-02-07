import ru.netology.service.CustomsService;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Добро пожаловать в калькулятор пошлины");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену товара (в руб.):");
        int price = scanner.nextInt();
        System.out.println("Введите вес товара (в кг.)");
        int weight = scanner.nextInt();
        System.out.println("Размер пошлины (в руб.) составит: " +CustomsService.calculateCustoms(price, weight));
    }
}
