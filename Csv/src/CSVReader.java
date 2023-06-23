import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static void main(String[] args) {
        String[] csvFiles = {"src/yob2012short.csv", "src/yob2013short.csv", "src/yob2014short.csv"};
        String line = "";
       String csvSplitBy = ",";

        for(String csvFile: csvFiles){
            try (BufferedReader br = new BufferedReader(new FileReader(csvFile)))
            {
                System.out.println("\nReading file: " + csvFile);

                while ((line = br.readLine()) != null) {
                    // use comma as separator
                    String[] values = line.split(csvSplitBy);

                    for(String value: values){
                        System.out.print(value + "  ");
                    }

                    System.out.println();
                }

            } catch (IOException e) {
                System.out.println("Error while reading file: " + csvFile);
                e.printStackTrace();
            }
        }
    }
}
