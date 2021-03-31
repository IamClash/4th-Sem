import java.io.*;
import java.util.*;
class eleven
{
    public static void main(String[] args)
    {
        List<String> lines = new ArrayList<String>();
        String line = null;
        try
        {
            File file = new File("file.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) 
            {
                Scanner lineScan = new Scanner(line);
                while(lineScan.hasNext())
                {
                    String word = lineScan.next();
                    line = Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
                    lines.add(line);
                }
                lines.add("\n");
            }
            fr.close();
            br.close();
            FileWriter fw = new FileWriter(file);
            BufferedWriter out = new BufferedWriter(fw);
            for(String s : lines)
                 out.write(s);
            out.flush();
            out.close();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}