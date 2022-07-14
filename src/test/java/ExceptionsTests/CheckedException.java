package ExceptionsTests;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public void abc() throws FileNotFoundException {
        File f = new File("Text1.txt");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Vse rabotaet");
    }
    public void def(){
        try {
            abc();
        }
        catch (FileNotFoundException e){
            System.out.println("Poyman exception : " + e);
        }
    }
    @Test
    public void zxc(){
        CheckedException ce = new CheckedException();
        ce.def();
    }
}
