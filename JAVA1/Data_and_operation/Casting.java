
public class Casting {

	public static void main(String[] args) {

      double a = 1;
       System.out.println(a); //1->1.0 automatic,invisible casting
	  int b = (int)8.9;	
	   System.out.println(b); //8.9->8 manual casting
	  
	  //change 8.9 to string
	   double c= 8.9; 
	   String d=String.valueOf(c);  
	   System.out.println(d.getClass());
	   
	 //change int b to string 
	   String e = Integer.toString(b);
	   System.out.println(e.getClass());
       

	}

}
