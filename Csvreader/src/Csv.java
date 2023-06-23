import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Csv {
    public static void main(String[] args) throws FileNotFoundException {
        String[] data = {"C:\\Users\\manoj\\Desktop\\yob2013short.csv",
                "C:\\Users\\manoj\\Desktop\\yob2014short.csv","C:\\Users\\manoj\\Desktop\\yob2012short.csv" };

        for (String filePath : data) {
            Scanner sc = new Scanner(new File(filePath));
            sc.useDelimiter(" , ");

            while (sc.hasNext()) {
                System.out.println(sc.next());
            }

            sc.close();
        }
    }
}
