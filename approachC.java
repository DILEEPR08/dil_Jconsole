import java.io.*;

public class approachC {
    public static void main(String[] args) {
        int bufferSize = 16 * 1024; 

        try (BufferedReader reader = new BufferedReader(
                new FileReader("realistic_employees.csv"), bufferSize)) {

            System.out.println("Reading file with buffer size: " + bufferSize + " bytes...");

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

