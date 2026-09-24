package RegExp;

import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Main {
    public static void main(String[] args) {
        Pattern ptr = Pattern.compile("[0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+");
        Matcher mtch = ptr.matcher("192.168.1.1");
        System.out.println(mtch.find());
    }
}
