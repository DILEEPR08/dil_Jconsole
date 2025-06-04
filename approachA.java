import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class approachA {
    public static void main(String[] args) {
        try {
            System.out.println("Reading file into memory...");
            List<String> lines = Files.readAllLines(Paths.get("realistic_employees.csv"));

            System.out.println("Processing " + lines.size() + " lines...");
            for (String line : lines) {
                processLine(line);  
            }

            System.out.println("Done processing.");

           
            Thread.sleep(60000); 
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void processLine(String line) {
        
        String[] fields = line.split(",");
    }
}
