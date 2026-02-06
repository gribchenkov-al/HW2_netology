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
        PrintStream var10000 = System.out;
        int var10001 = calculateCustoms(price, weight);
        var10000.println("Размер пошлины (в руб.) составит: " + var10001);
    }

    public static int calculateCustoms(int price, int weight) {
        int customsPrice = price / 100;
        int customsPriceWeight = weight * CustomsService.CUSTOM_WEIGHT;
        return customsPriceWeight + customsPrice;
    }
}
