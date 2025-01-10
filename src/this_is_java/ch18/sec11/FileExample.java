package this_is_java.ch18.sec11;

import java.io.File;

public class FileExample {

    public static void main(String[] args) throws Exception {

        File dir = new File("directory");
        File file1 = new File("file1");
        File file2 = new File("file2");
        File file3 = new File("file3");

        if (dir.exists() == false) dir.mkdir();
        if (file1.exists() == false) file1.createNewFile();
        if (file2.exists() == false) file2.createNewFile();
        if (file3.exists() == false) file3.createNewFile();
    }
}
