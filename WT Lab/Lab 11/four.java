import java.io.*;
class four
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("input.txt");
        FileReader fr = new FileReader(file);
        char ch[] = new char[(int) file.length()];
        fr.read(ch);
        File out = new File("output.txt");
        FileWriter fw = new FileWriter(out);
        fw.write(ch);
        System.out.println("Data copied successfully to output.txt");
        fw.flush();
    }
}