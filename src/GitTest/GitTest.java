package GitTest;


import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class GitTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();

        StringBuilder str = new StringBuilder();

        System.out.print("Введите длинну генерации строки: ");

        int length = 0;
        if(scanner.hasNextInt())
          length  = scanner.nextInt();
        else return;

        for(int i =0; i < length; ++i){
            int numberRand = rand.nextInt(26);
            int randCase = rand.nextInt(10);
            int symbolInt = 'a' + numberRand;
            if(randCase > 5)
              str.append(String.valueOf((char) symbolInt).toUpperCase(Locale.ROOT));
            else
                str.append(String.valueOf((char) symbolInt));
        }

        System.out.println("\nСгенерированая строка: " + str.toString());

    }

}
