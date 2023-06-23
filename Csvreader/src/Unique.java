import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Unique {
    public static void main(String[] args) throws FileNotFoundException {
        int year = 2012;
        String name = "";
        String gender = "M";
        int rank = getRank(year, name, gender);
        System.out.println("Rank: " + rank);
    }

    private static int getRank(int year, String name, String gender) throws FileNotFoundException {
        String filePath = "C:\\Users\\manoj\\Desktop\\yob" + year + "short.csv";
        Scanner sc = new Scanner(new File(filePath));
        int rank = 1; // Initialize the rank as 1 (assuming the highest number of births)

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split("\t");

            if (parts.length >= 3) {
                String currName = parts[0].trim();
                String currGender = parts[1].trim();
                int births = Integer.parseInt(parts[2].trim());

                if (currName.equals(name) && currGender.equals(gender)) {
                    sc.close();
                    return rank; // Found the name with the given gender, return the current rank
                }

                if (currGender.equals(gender)) {
                    rank++; // Increment the rank for names with the same gender
                }
            }
        }

        sc.close();
        return -1; // Name with the given gender not found in the file, return -1
    }
}
