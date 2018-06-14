/**
 * TempJava
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TempJava {

    public static void main(String[] args) {
        ECal e = new ECal();
        e.shift2b();
    }
}

/**
 * FileInputTest
 */

class Change {
    void func() {
        // int i = 1;
        // String s = i + "";
        try {
            System.out.println(Integer.parseInt("4a"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println("illegal input.");
        }
    }
}

class ECal{
    void test(int i) {
        for (int n = 0; n < i; n++) {
            System.out.println(Math.pow((1+1.0/n), n));
        }
    }
    void shift2b() {
        byte t = 85;
        for (int i = 0; i < 8; i++) {
            byte temp = (byte)(t >> 1);
            temp = (byte)(temp << 1);
            System.out.print(t - temp);
            t = (byte)(t >> 1);
        }
    }

}