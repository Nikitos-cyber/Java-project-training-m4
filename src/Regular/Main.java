package Regular;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String number  = String.valueOf(scanner.nextInt());

        System.out.println(number.replaceAll("(\\d)(?=(\\d{3})+$)", "$1,"));

        scanner.close();
    }
}
