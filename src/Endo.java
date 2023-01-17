import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Endo {
    public static void main(String[] args) throws FileNotFoundException {
        Endo();
    }
    static String Endo() throws FileNotFoundException {

        Scanner names = new Scanner(new File("list.txt"));
        int slumptal = (int) (Math.random()*161);
        int i = 0;

        while (i < slumptal) {
            names.nextLine();
            i++;
        }
        String name = names.nextLine();
        System.out.println(name);


        return "";

        //ska return en string
    }
}










