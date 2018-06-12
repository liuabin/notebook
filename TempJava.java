/**
 * TempJava
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;

public class TempJava {

    public static void main(String[] args) {
        FileInputTest f = new FileInputTest();
        f.fileInput("f:\\temp.cpp");
        // try {
        // } catch (Exception e){
        //     e.printStackTrace();
        // }
    }
}

/**
 * FileInputTest
 */
class FileInputTest {

    public void fileInput(String path) {
        File f = new File(path);
        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("File opened successfully.");
            System.out.println((char)(fis.read()));
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
            // throw(new Exception());
        } finally {
            // Do noting.
        }         
    }
}