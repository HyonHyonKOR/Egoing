
public class AccountingApp2 {
	
	//供給価格
	public static double valueOfSupply = 10000.0;
	//消費税率
	public static double vatRate = 0.1;
	//消費税額
	public static double getVAT() {
	return valueOfSupply*vatRate;
	}
	//商品総額
	public static double gettotal() { 
	return valueOfSupply+getVAT();
		}

public static void main(String[] args) {


System.out.println("value of supply : "+ valueOfSupply);
System.out.println("VAT : " +getVAT());
System.out.println("Total : "+gettotal()); }

}