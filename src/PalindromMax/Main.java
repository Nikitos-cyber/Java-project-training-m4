package PalindromMax;

public class Main {
    public static void main(String[] args) {
        String str = "aba abba";
        longestPalindromicSubstringIgnoreCase(str);
    }




    static String longestPalindromicSubstringIgnoreCase(String s) {
        if (s == null || s.isEmpty()) return "";

        String lower = s.toLowerCase(java.util.Locale.ROOT); // сравниваем без учёта регистра, единообразно для всех локалей
        int start = 0, end = 0;         // текущие лучшие границы [start..end]

        for (int i = 0; i < lower.length(); i++) {
            int lenOdd  = expandAroundCenter(lower, i, i);     // центр в символе i
            int lenEven = expandAroundCenter(lower, i, i + 1); // центр между i и i+1
            int len = Math.max(lenOdd, lenEven);

            // Переводим "длину" обратно в [start..end] вокруг центра i
            int newStart = i - (len - 1) / 2;
            int newEnd   = i + len / 2;

            if (len > end - start + 1) {
                start = newStart;
                end = newEnd;
            }
        }
        // Возвращаем подстроку из ИСХОДНОЙ строки (с сохранением исходных регистров/символов)
        return s.substring(start, end + 1);
    }

    // Расширяемся от центра (L, R), пока символы равны. Возвращаем длину найденного палиндрома.
    static int expandAroundCenter(String lower, int L, int R) {
        while (L >= 0 && R < lower.length() && lower.charAt(L) == lower.charAt(R)) {
            L--;
            R++;
        }
        // Цикл остановился на первой "плохой" паре, поэтому реальная длина = R - L - 1
        return R - L - 1;
    }
}




