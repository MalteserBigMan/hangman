public class Malte {
    private static String gissadebokstäver ="";

    public static String gissadbokstav(String bokstav) {
        gissadebokstäver += bokstav;
        return gissadebokstäver;


    }
    char[] guesssedLetters = gissadebokstäver.toCharArray();


}

