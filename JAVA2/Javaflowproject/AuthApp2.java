
public class AuthApp2 {

	public static void main(String[] args) {
   
        String id = "angel";
        String inputId= args[0];
        
        String pass = "1111";
        String pass2 = "2222";
        String inputPass= args[1];
               		
        
        System.out.println("Hi."+args[0]);
        boolean isRightpass = (inputPass.equals(pass)||inputPass.equals(pass2));
        if(inputId.equals(id) && isRightpass) 
        	{
        	System.out.println("Welcome to Heaven!");    	
        }else {
        	System.out.println("Go to Hell");
        }
        
        
    }

}
