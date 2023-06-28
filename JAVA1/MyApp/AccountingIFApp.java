
public class AccountingIFApp {

	public static void main(String[] args) {
		
	
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expanseRate = 0.3;
		double vat = valueOfSupply*vatRate;
		double total = valueOfSupply+vat;
		double expanse = valueOfSupply*expanseRate;
		double income = valueOfSupply-expanse;
		
		double devidend1;
		double devidend2;
		double devidend3;
		
		if(income>10000.0) {
		devidend1 = income*0.5;
		devidend2 = income*0.3;
		devidend3 = income*0.2;
		}else {
			devidend1 = income*1.0;
			devidend2 = income*0;
			devidend3 = income*0 ;
		}
		
		
		System.out.println("value of supply : "+ valueOfSupply);
		System.out.println("VAT : " +vat);
		System.out.println("Total : "+total);
		System.out.println("Expanse : "+expanse);
		System.out.println("Income : "+income);
		System.out.println("Devidend 1: "+devidend1);
		System.out.println("Devidend 2: "+devidend2);
		System.out.println("Devidend 3: "+devidend3);
               		

	}

}
