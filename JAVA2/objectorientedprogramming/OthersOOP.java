import java.io.FileWriter;
import java.io.IOException;


public class OthersOOP {
	//class: System, Math, FileWriter
	//instance: f1, f2 
	
	public static void main(String[] args) throws IOException {

		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.ceil(1.1111111));
		System.out.println(Math.floor(1.1111111));
		
		FileWriter f1 = new FileWriter("data.txt");
		f1.write("hello"); 
		f1.write(" java"); 
		
		FileWriter f2 = new FileWriter("data2.txt");
		f2.write("hello"); 
		f2.write(" java2"); 
		f2.close();
		
		
		f1.write("!!!");
		f1.close();
	}

}
