package Palindrom;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String text = "aba";
        text= text.toLowerCase(Locale.ROOT);
        int start = 0;
        int end = text.length() - 1;

        while(true){

            while((text.charAt(start) < 'a' && text.charAt(start) > 'z') && (start < text.length() - 1)) {
                start++;
            }
            while((text.charAt(end) >= 'a' && text.charAt(end) <= 'z') && (end > 0)){
               end--;
            }

            if(text.charAt(start) != text.charAt(end)){
                System.out.println("isNot palidrom!!!");
                break;
            }
            if(start == end || start > end ){
                System.out.println("is Palindrom!!!");
                break;
            }

        start++;end--;




        }

    }

}
