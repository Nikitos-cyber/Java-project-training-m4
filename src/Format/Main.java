package Format;

public class Main {
    public static void main(String[] args) {

        String carMark = "Audi";
        String carModel = "Q3";
        double price = 1_000_000.00;
        boolean hasAuthomaticTransmition = true;

        String str = String.format("Привет я менеджер салона %s\nУ нас есть модель %s за %.2f\nНаличие коробки передачь: %s", carMark,carModel,price,hasAuthomaticTransmition ? "ДА": "НЕТ");
        System.out.println(str);

    }
}
