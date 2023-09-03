import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Writer wr = new Writer();
        try {
            wr.write();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}