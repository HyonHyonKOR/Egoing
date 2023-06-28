import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class InstanceApp {
    public static void main(String[] args) throws IOException  {
    	
//   1. newを入力することでPrintWriterをコピーを作り、p1という変数に入れる
//   2. このp1に入る値をPrintWriterのInstance（インスタンス）という。
//   3. 変数p1にはデータータイプが必要だ。
//   4. p1になんでも入るならエラーがでるので、p1の前にPrintWriterをデータ型を入力する。
//　 5. p1にはPrintWriterのclassのInstanceだけ入るようになった。
//   6. 例外処理をする。今の時点では理解しなくていい。ただする。 	
    	
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("hello 1");
		p1.close();
	    
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("hello 2");
		p2.close();

	}

}
