package Regular;

public class Main {
    public static void main(String[] args) {

        System.out.println("12345678".replaceAll("(\\d)(?=(\\d{3})+$)", "$1,"));
    }
}
