import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        BufferedReader reader = null;
        int total = 0;
        String line = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\javademos\\readingFileDemo\\src\\sayilar.text"));
            while ((line = reader.readLine()) != null) {
                total += Integer.valueOf(line); // total += Integer.parseInt(line)
            }
            System.out.println(total);
        } catch (FileNotFoundException exception) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                reader.close();
            } catch (IOException exception) {
                System.out.println("Hata yakalandı.");
            }

        }
    }
}