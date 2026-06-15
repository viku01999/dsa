package exception_handling;

import java.io.FileReader;
import java.io.IOException;

public class Example2 {

    public static void readFile(String fileName) throws IOException {
        System.gc();

        FileReader file = new FileReader(fileName);

        try (file) {
            int data;
            while ((data = file.read()) != -1){
                System.out.println((char) data);
            }
        }
    }

    public static void main(String[] args) {
        try {
            readFile("/home/vikas.kumar/Downloads/sample1.txt");
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }

}
