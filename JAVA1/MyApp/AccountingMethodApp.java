
public class AccountingMethodApp {

	public static double valueOfSupply;
	public static double vatRate;
	public static double total;
	public static double expanseRate;
	public static void main(String[] args) {
		      	
		valueOfSupply = 5000.0;   
		vatRate = 0.1;
		expanseRate = 0.3;
		print();

	}


	public static void print() {
		System.out.println("value of supply : "+ valueOfSupply);
		System.out.println("VAT : " +getVAT());
		System.out.println("Total : "+getTotal());
		System.out.println("Expanse : "+getExpanse());
		System.out.println("Income : "+getIncome());
		System.out.println("Devidend 1: "+getDividend1());
		System.out.println("Devidend 2: "+getDividend2());
		System.out.println("Devidend 3: "+getDividend3());
	}

	

	public static double getDividend1() {
		return getIncome()*0.5;
	}

    public static double getDividend2() {
    	return getIncome()*0.3;
    }
    	
    public static double getDividend3() {
		return getIncome()*0.2;
	}

	public static double getIncome() {
		return valueOfSupply-getExpanse();
	}

	public static double getExpanse() {
		return valueOfSupply*expanseRate;
	}

	public static double getTotal() {
		return valueOfSupply+getVAT();
	}

	public static double getVAT() {
		return valueOfSupply*vatRate;
	}

}
