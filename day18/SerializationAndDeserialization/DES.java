package day18.SerializationAndDeserialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DES {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String path = "C:\\Users\\Shaik   Baba Shareef\\IdeaProjects\\java training\\src\\day18\\SerializationAndDeserialization\\F1.txt";
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        SER s=(SER) ois.readObject();
        s.display();
        ois.close();
        fis.close();
    }
}