import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        byte a = 12;
        int b = 15;
        float c = 6f;
        char d = 12;
        double vurazenie = a * (b + (c / d));
        System.out.println("Значение выражения: " + vurazenie);
    }

    public static void sravnenie(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;

        if (sum >= 10 & sum <= 20){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static void chislo(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a >= 0) {
            System.out.println("Введенное значение положительное");
        } else {
            System.out.println("Введенное значение отрицательное");
        }
    }


    public static void otric(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void privetstvie(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.toString();

        System.out.println("Привет, " + name + "!");
    }

    public static void visokosnyiGod(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int ost1 = year % 4;
        int ost2 = year % 400;

        if (ost2 == 0) {
            System.out.println("Год високосный!");
        } else if (ost1 == 0) {
            System.out.println("Год високосный!");
        } else {
            System.out.println("Год не високосный!");
        }
    }
}
