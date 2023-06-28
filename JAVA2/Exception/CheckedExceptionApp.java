import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {

	public static void main(String[] args) {
		
		
        try (FileWriter f = new FileWriter("data.txt")) {f.write("hello");
        }
        catch(IOException e) {
        	e.printStackTrace();
        }

	}
}