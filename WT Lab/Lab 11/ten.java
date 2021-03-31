import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
class ten
{
    public static void main(String[] args) throws IOException
    {
        File f1 = new File("file1.bin");
        File f2 = new File("file2.bin");
        InputStream i1 = new FileInputStream(f1);
        System.out.println("Text inside file1.bin = "+ Files.readAllLines(Paths.get("file1.bin")).get(0));
        InputStream i2 = new FileInputStream(f2);
        System.out.println("Text inside file2.bin = "+ Files.readAllLines(Paths.get("file2.bin")).get(0));
        int b1,b2,i=0;
        while (((b1 = i1.read()) != -1)&&((b2 = i2.read()) != -1))
        {
            i++;
            if(b1!=b2)
            {
                System.out.println("Binary files differ at position "+i);
                break;
            }
        }
    }
}