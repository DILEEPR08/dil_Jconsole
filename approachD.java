import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class approachD {
    public static void main(String[] args) {
        System.out.println("Processing file using Java Streams...");

        try (Stream<String> lines = Files.lines(Paths.get("realistic_employees.csv"))) {
            long lineCount = lines
                .peek(approachD::processLine) 
                .count();                      

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

