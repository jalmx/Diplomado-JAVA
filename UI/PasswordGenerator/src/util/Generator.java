package util;

import java.util.Random;

public final class Generator {

    private Generator() {
    }

    public static String password(int leght) {
        StringBuilder pass = new StringBuilder();

        for (int i = 0; i < leght; i++) {
            pass.append(letter(phrases()[new Random().nextInt(phrases().length)]));
        }

        return pass.toString();
    }

    private static String[] phrases() {
        String simbols = "\\ºª@\"#$%&/()=?¿'¡`´-.,;:_¨^";
        String numbers = "1234567890";
        StringBuilder lettersLower = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            lettersLower.append(i);
        }

        String lettersUpper = lettersLower.toString().toUpperCase();

        StringBuilder password = new StringBuilder();

        String[] phrases = {simbols, numbers, lettersUpper, lettersLower.toString()};

        return phrases;
    }

    private static String letter(String phrase) {
        Random random = new Random();
        int r = random.nextInt(phrase.length());

        return phrase.substring(r, r + 1);
    }

}
