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
            // for (int i = 0; i < 10; i++) {
            //     System.out.print((char)(fis.read()));
            // }
            char temp;
            temp = (char)fis.read();
            while(temp!='\0'){
                System.out.print(temp);
                temp = (char)fis.read();
            }
            fis.close();
        } catch (IOException | NullPointerException e) {
            if (e instanceof IOException) {
                System.out.println("This is a IO Exception.");
            }
            e.printStackTrace();
            // throw(new Exception());
        } finally {
            // Do noting.
        }         
    }
}