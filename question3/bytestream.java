
package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteStreamForb {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        FileInputStream fis=new FileInputStream("G:\\lab10\\src\\main\\java\\filehandling\\speec.mp3");
        FileOutputStream fos=new FileOutputStream("G:\\lab10\\src\\main\\java\\filehandling\\Speech.mp3");
        int read;
        while((read=fis.read())!=-1){
            fos.write(read);
            System.out.println(read);
        }
       
    }
   
}

