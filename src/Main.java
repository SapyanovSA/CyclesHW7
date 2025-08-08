import java.time.Year;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");

        int salary = 15_000;
        int total = 0;
        int i = 1;

        while (total <= 2_459_000) {
            total += salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " руб.");
            i++;
        }

        // Задача 2
        System.out.println("Задача 2");

        int z = 1;

        while (z <= 10) {
            System.out.print(z + " ");
            z++;
        }
        System.out.println();

        for (z = 10; z >= 1; z--) {
            System.out.print(z + " ");
        }
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");

        int country = 12_000_000;

        for (int i1 = 1; i1 <= 10; i1++) {
            int population = (country / 1000 * 17) - (country / 1000 * 8);
            country += population;
            System.out.println("Год " + i1 + " численность начеления составляет " + country);
        }

        //Задача 4
        System.out.println("Задача 4");

        salary = 15_000;
        total = 0;
        int mounthCounter = 1;

        while (total < 12_000_000) {
            total += (salary / 100 * 7);
            total += salary;
            System.out.println("Месяц " + mounthCounter + " всего денег " + total);
            mounthCounter++;
        }

        //Задача 5
        System.out.println("Задача 5");

        salary = 15_000;
        total = 0;
        mounthCounter = 1;

        while (total < 12_000_000) {
            total += (salary / 100 * 7);
            total += salary;
            if (mounthCounter % 6 == 0) {
                System.out.println("Месяц " + mounthCounter + " всего денег " + total);
            }
            mounthCounter++;
        }

        //Задача 6
        System.out.println("Задача 6");

        int money = 15_000;
        int totalMoney = 0;
        int halfAYear = 9 * 12;

        for (int x = 1; x <= halfAYear; x++) {
            totalMoney += money;
            totalMoney += (money / 100 * 7);
            if (x % 6 == 0) {
                System.out.println("Месяц " + x + " всего денег " + totalMoney);
            }
        }

        //Задача 7
        System.out.println("Задача 7");

        int friday = 5;

        for (int c = friday; c <= 31; c += 7) {
                System.out.println("Число " + c + " является пятницей, подготовте отчет.");
        }

        // Задача 8
        System.out.println("Задача 8");

        int nowYear = 2025;
        int maxYear = nowYear + 100;
        int minYear = nowYear - 200;

        for (int v = 0; v <= maxYear; v += 79) {

            if (v >= minYear) {
                System.out.println(v);
            }

        }

    }
}
