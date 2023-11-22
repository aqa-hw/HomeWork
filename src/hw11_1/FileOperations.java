package hw11_1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperations {
    public static void main(String[] args) {

        File folder = new File("myFolder");

        if (!folder.exists() && folder.mkdir()) {
            System.out.println("Folder created");


            File file1 = new File(folder, "file1.txt");
            File file2 = new File(folder, "file2.txt");

            try {
                try (FileWriter writer = new FileWriter(file1)) {
                    writer.write("Java world");
                }


                try (FileReader reader = new FileReader(file1)) {
                    char[] buffer = new char[(int) file1.length()];
                    reader.read(buffer);
                    String content = new String(buffer);
                    System.out.println("file1 content: " + content);

                    try (FileWriter writer = new FileWriter(file2)) {
                        writer.write(content);
                    }
                    try (FileReader reader2 = new FileReader(file2)) {
                        buffer = new char[(int) file2.length()];
                        reader2.read(buffer);
                        content = new String(buffer);
                        System.out.println("file2 content: " + content);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    file1.delete();
                    file2.delete();
                    folder.delete();
                } catch (SecurityException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Cannot create folder");
        }
    }
    }