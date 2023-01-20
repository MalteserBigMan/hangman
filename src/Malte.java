import java.sql.SQLOutput;

public class Malte {
    private static String gissadebokstäver = "";

    public static String gissadbokstav(String bokstav) {
        gissadebokstäver += bokstav;
        return gissadebokstäver;
    }

    public static char[] gissadeBokstaverSomLista() {
        char[] guessedLetters = gissadebokstäver.toCharArray();
        return guessedLetters;
    }

    public static void galgbacke(int fel) {
        if (fel == 1) {
            System.out.println(" ___________");
            System.out.println("/           \\");
        } else if (fel == 2) {
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println(" ___________");
            System.out.println("/           \\");
        } else if (fel == 3) {
            System.out.println("       __________");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println(" ___________");
            System.out.println("/           \\");
        } else if (fel == 4) {
            System.out.println("      __________");
            System.out.println("      |/");
            System.out.println("      |         ");
            System.out.println("      |         ");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println(" ___________");
            System.out.println("/           \\");
        } else if (fel == 5) {
            System.out.println("      __________");
            System.out.println("      |/       | ");
            System.out.println("      |         ");
            System.out.println("      |         ");
            System.out.println("      |         ");
            System.out.println("      |         ");
            System.out.println("      |         ");
            System.out.println(" ___________");
            System.out.println("/           \\");
        } else if (fel == 6) {
            System.out.println("      __________");
            System.out.println("      |/       | ");
            System.out.println("      |        O");
            System.out.println("      |        ");
            System.out.println("      |         ");
            System.out.println("      |         ");
            System.out.println("      |         ");
            System.out.println(" ___________");
            System.out.println("/           \\");
        } else if (fel == 7) {
            System.out.println("      __________");
            System.out.println("      |/       | ");
            System.out.println("      |        O");
            System.out.println("      |        |");
            System.out.println("      |         \\");
            System.out.println("      |         ");
            System.out.println("      |         ");
            System.out.println(" ___________");
            System.out.println("/           \\");
        } else if (fel == 8) {
            System.out.println("      __________");
            System.out.println("      |/       | ");
            System.out.println("      |        O");
            System.out.println("      |        |");
            System.out.println("      |       / \\");
            System.out.println("      |         ");
            System.out.println("      |         ");
            System.out.println(" ___________");
            System.out.println("/           \\");
        } else if (fel == 9) {
            System.out.println("      __________");
            System.out.println("      |/       | ");
            System.out.println("      |        O");
            System.out.println("      |       /|");
            System.out.println("      |       / \\");
            System.out.println("      |         ");
            System.out.println("      |         ");
            System.out.println(" ___________");
            System.out.println("/           \\");
        } else {
            System.out.println("      __________");
            System.out.println("      |/       | ");
            System.out.println("      |        O");
            System.out.println("      |       /|\\");
            System.out.println("      |       / \\");
            System.out.println("      |         ");
            System.out.println("      |         ");
            System.out.println(" ___________");
            System.out.println("/           \\");
        }


    }
}