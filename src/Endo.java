import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Endo {
    static String Endo(String[] args) throws FileNotFoundException {

        Scanner names = new Scanner(new File("list.txt"));
        int i = 161;
        int slumptal = (80 * 2);

        while (i > 0) {
            slumptal = (int) (Math.random());
            names.nextLine();

        }
        String name = names.nextLine();
        System.out.println(name);


        return "";
    }
}










