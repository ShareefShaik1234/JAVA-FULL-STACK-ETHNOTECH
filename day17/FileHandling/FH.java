package day17.FileHandling;

import java.io.*;
import java.util.Scanner;

public class FH {
    public static void main(String[] args) {

        try {

            // File Path
            String path = "C:\\Users\\Shaik Baba Shareef\\IdeaProjects\\java training\\src\\Day17\\FileHandling\\test.txt";

            // ==========================
            // 1. CREATE FILE
            // ==========================
            File file = new File(path);

            if (file.createNewFile()) {
                System.out.println("File Created Successfully");
            } else {
                System.out.println("File Already Exists");
            }

            // ==========================
            // 2. WRITE DATA TO FILE
            // ==========================
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            bw.write("Hello World");
            bw.newLine();
            bw.write("Jaan Shaik");
            bw.newLine();

            bw.close();

            System.out.println("Data Written Successfully");

            // ==========================
            // 3. APPEND DATA
            // ==========================
            BufferedWriter bw2 = new BufferedWriter(new FileWriter(file, true));

            bw2.write("This is appended data");
            bw2.newLine();

            bw2.close();

            System.out.println("Data Appended Successfully");

            // ==========================
            // 4. TAKE INPUT FROM CONSOLE
            // ==========================
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Text : ");
            String input = sc.nextLine();

            BufferedWriter bw3 = new BufferedWriter(new FileWriter(file, true));

            bw3.write(input);
            bw3.newLine();

            bw3.close();

            // ==========================
            // 5. READ FILE & PRINT
            // ==========================
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;

            System.out.println("\nFile Content:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

            // ==========================
            // 6. COUNT CHARACTERS
            // ==========================
            FileReader fr = new FileReader(file);

            int ch;
            int count = 0;

            while ((ch = fr.read()) != -1) {
                count++;
            }

            fr.close();

            System.out.println("\nTotal Characters = " + count);

            // ==========================
            // 7. COPY FILE BYTE BY BYTE
            // ==========================
            File source = new File(path);

            File destination = new File(
                    "C:\\Users\\Shaik Baba Shareef\\IdeaProjects\\java training\\src\\Day17\\FileHandling\\test1.txt");

            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(destination);

            while ((ch = fis.read()) != -1) {
                fos.write(ch);
            }

            fis.close();
            fos.close();

            System.out.println("File Copied Successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}