package ExceptionsTests;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException1 {

    public void abc  ()  {
        File f = new File("Text.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Vse rabotaet");
    }
    public void def(){
        abc();
    }
    @Test
    public void zxc(){
        CheckedException1 ce = new CheckedException1();
        ce.def();
    }
}
