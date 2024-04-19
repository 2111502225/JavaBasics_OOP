import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment17 {
    public static void main(String[] args) {
        // Define file paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // Open the input file for reading
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));

            // Open the output file for writing
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            // Read each line from the input file, manipulate it, and write to the output file
            String line;
            while ((line = reader.readLine()) != null) {
                // Manipulate the data (e.g., convert to uppercase)
                String manipulatedLine = line.toUpperCase();

                // Write the manipulated data to the output file
                writer.write(manipulatedLine);
                writer.newLine(); // Add a newline after each line
            }

            // Close the input and output files
            reader.close();
            writer.close();

            System.out.println("Data has been read from '" + inputFile + "', manipulated, and written to '" + outputFile + "'.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
