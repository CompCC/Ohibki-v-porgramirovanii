package Lection3;

import java.io.FileWriter;
import java.io.IOException;

public class SaveService {
    public void save() throws Save_Exception{
        System.out.println("save document started....");
        try(FileWriter writer = new FileWriter("test")) {
            throw new IOException("operation failed");
        }catch (IOException e){
            System.out.println(e.getMessage());
            throw new Save_Exception("Saved documents failed", e);
        }
    }
}
