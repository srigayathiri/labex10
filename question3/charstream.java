
package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamForb {

    public static void main(String[] args) throws FileNotFoundException, IOException {
      
        FileReader fr=new FileReader("G:\\lab10\\src\\main\\java\\filehandling\\speec.mp3");
        FileWriter fw=new FileWriter("G:\\lab10\\src\\main\\java\\filehandling\\Speech.mp3");
        int readd;
       
        while((readd=fr.read())!=-1){
            System.out.println((char)readd);
            fw.write((char)readd);
        }
    }
   
}

