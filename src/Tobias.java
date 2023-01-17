public class Tobias {

    public static int[] findLocationOfLetterInString(String text, char letter) {
        int countLetters = 0;
        for (int i = 0; i < text.length() ; i++)
            if (text.charAt(i) == letter) {
                countLetters++;
            }


        int[] positions = new int[countLetters];
        int lettersFound = 0;

        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == letter) {
                positions[lettersFound] = i;
                lettersFound++;
            }
        }
        return positions;
    }
}
