package day18.SerializationAndDeserialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        SER s=new SER(1,"shaik");
        s.display();

        String path="C:\\Users\\Shaik   Baba Shareef\\IdeaProjects\\java training\\src\\day18\\SerializationAndDeserialization\\F1.txt";
        FileOutputStream fos=new FileOutputStream(path);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(s);
        oos.close();
        fos.close();



    }
}
