package day18_io.exer;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class test1 {
    @Test
    public void test() throws IOException {
        File file = new File("F:\\hh\\hi.txt");
        if(!file.exists()){
            file.createNewFile();
            System.out.println("创建成功");
        }
        file.delete();
    }
}
