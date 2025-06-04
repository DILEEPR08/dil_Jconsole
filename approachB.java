import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class approachB {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("realistic_employees.csv"))) {
            System.out.println("Reading file line by line...");

            String line;
            int lineCount = 0;

            while ((line = reader.readLine()) != null) {
                processLine(line);
                lineCount++;
            }

            System.out.println("Processed " + lineCount + " lines.");

            
            Thread.sleep(60000); 
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void processLine(String line) {
        
        String[] fields = line.split(",");
        
    }
}
