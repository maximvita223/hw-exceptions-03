import java.io.IOException;

public class ParserUser {

    public static void main(String[] args) {
        Writerer wr = new Writerer();
        try {
            wr.write();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}