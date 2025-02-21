import com.google.common.io.Files;
import com.google.common.base.Strings;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Starting Large Java Application...");
        createLargeFile();
        System.out.println("Large Java Application Finished.");
    }

    private static void createLargeFile() {
        try {
            File file = new File("largefile.txt");
            String data = Strings.repeat("A", 1000000);
            Files.asCharSink(file, StandardCharsets.UTF_8).write(data);
            System.out.println("Large file created: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error creating large file: " + e.getMessage());
        }
    }
}
