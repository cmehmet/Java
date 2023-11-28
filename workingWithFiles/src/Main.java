import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = createFile("C:\\javademos\\files\\students.txt");
        getFileInfo(file);

        System.out.println();

        readFile("C:\\javademos\\files\\students.txt");
        writeFile("Emrah Atay","C:\\javademos\\files\\students.txt");
        readFile("C:\\javademos\\files\\students.txt");
    }


    public static File createFile(String filePath) {

        File file = new File(filePath);
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya belirtilen yola başarıyla oluşturuldu.");
                return file;
            } else {
                System.out.println("Dosya zaten var.");
            }
            return file;
        } catch (IOException ioException) {
            ioException.getMessage();
        }

        return file;
    }

    public static void getFileInfo(File file) {

        if (file.exists()) {
            System.out.println("Dosya Bilgileri\n-----------------\nDosya adı : " + file.getName());
            System.out.println("Dosya yolu : " + file.getAbsolutePath());
            System.out.println("Dosya yazdırılabilir mi? : " + file.canWrite());
            System.out.println("Dosya okunabilir mi? : " + file.canRead());
            System.out.println("Dosya boyutu(byte) : " + file.length());
        } else {
            System.out.println("Dosya bulunamadı.");
        }


    }

    public static void readFile(String filePath){
        File file = new File(filePath);
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String text, String filePath){

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true));
            writer.newLine();
            writer.write(text);
            System.out.println("Dosyaya başarıyla yazıldı.");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }




    //public static void isExist(File file, String text){
    //}
    /*public static void writeFile(String text, String filePath){
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            File file = new File(filePath);
            Scanner reader = new Scanner(file);

            ArrayList<String> data = new ArrayList<String>();

            if (reader.hasNextLine()){
                String line = reader.nextLine();
                data.add(line);
            }
            data.add(text);

            for (String line : data){
                System.out.println(line);;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }*/
}