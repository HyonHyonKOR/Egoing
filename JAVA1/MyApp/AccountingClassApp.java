
class Accounting{
	public double valueOfSupply;
	public double vatRate;
	public double total;
	public double expanseRate;
	
	public void print() {
		
		
        System.out.println("value of supply : "+ valueOfSupply);
		System.out.println("VAT : " +getVAT());
		System.out.println("Total : "+getTotal());
		System.out.println("Expanse : "+getExpanse());
		System.out.println("Income : "+getIncome());
		System.out.println("Devidend 1: "+getDividend1());
		System.out.println("Devidend 2: "+getDividend2());
		System.out.println("Devidend 3: "+getDividend3());
		System.out.println();
	}

	

	public double getDividend1() {
		return getIncome()*0.5;
	}

	public double getDividend2() {
    	return getIncome()*0.3;
    }
    	
	public double getDividend3() {
		return getIncome()*0.2;
	}

	public double getIncome() {
		return valueOfSupply-getExpanse();
	}

	public double getExpanse() {
		return valueOfSupply*expanseRate;
	}

	public double getTotal() {
		return valueOfSupply+getVAT();
	}

	public double getVAT() {
		return valueOfSupply*vatRate;
	}

}


public class AccountingClassApp {

	public static void main(String[] args) {
		      	
       
	    Accounting a1 = new Accounting();
	    
	    a1.valueOfSupply= 10000.0;
	    a1.vatRate= 0.1;
	    a1.expanseRate= 0.3;
	    a1.print();
	    
	    Accounting a2 = new Accounting();
	    a2.valueOfSupply= 20000.0;
	    a2.vatRate= 0.08;
	    a2.expanseRate= 0.35;
	    a2.print();
	    
	    Accounting a3 = new Accounting();
	    a3.valueOfSupply= 8000.0;
	    a3.vatRate= 0.07;
	    a3.expanseRate= 0.38;
	    a3.print();
	    
	    
	    
	    
	    
	}


	

}
