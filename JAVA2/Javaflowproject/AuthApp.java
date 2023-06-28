
public class AuthApp {

	public static void main(String[] args) {
   
        String id = "angel";
        String inputId= args[0];
        
        String pass = "1111";
        String inputPass= args[1];
               		
        
        System.out.println("Hi."+args[0]);
        
        //if(inputID == id) {
        if(inputId.equals(id) && inputPass.equals(pass)) 
        	{
        	System.out.println("Welcome to heaven!");    	
        }else {
        	System.out.println("Go to hell");
        }
        
        
    }

}
