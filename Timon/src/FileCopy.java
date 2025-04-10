import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        // Specify the source and destination file paths
        String sourceFile = "C:\\Users\\timon\\Downloads\\temp\\source.txt";
        String destinationFile = "C:\\Users\\timon\\Downloads\\temp\\destination.txt";

        FileReader fileReader = null;
        FileWriter fileWriter = null;

        try {
            // Initialize FileReader and FileWriter
            fileReader = new FileReader(sourceFile);
            fileWriter = new FileWriter(destinationFile);

            int character;

            // Read characters from the source file and write them to the destination file
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                // Close the streams
                if (fileReader != null) {
                    fileReader.close();
                }
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.err.println("Failed to close streams: " + e.getMessage());
            }
        }
    }
}
    