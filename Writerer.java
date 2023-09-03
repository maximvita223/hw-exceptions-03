import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writerer {

    public void write() throws IOException {
        Scann sc = new Scann();
        sc.scannParser();
        FileWriter writer = new FileWriter(sc.lst[0] + ".txt", true);
        BufferedWriter buffwriter = new BufferedWriter(writer);
        for (String elem : sc.lst) {
            System.out.println(elem);
            buffwriter.write("<" + elem + ">");
        }
        buffwriter.write("\n");
        buffwriter.close();
        writer.close();
    }

}