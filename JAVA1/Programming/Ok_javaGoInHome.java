import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Speaker;
import org.opentutorials.iot.Aircon;



public class Ok_javaGoInHome {

	public static void main(String[] args) {
        
		String Address ="타워팰리스 5021호";
		
//		Elevator call
		Elevator myElevator = new Elevator(Address);
		myElevator.callForDown(1);
		
//		Security off 
	    Security mySecurity= new Security(Address);
	    mySecurity.off();
		
//		Light off
	    Lighting Livingroom_Lighting=new Lighting(Address);
	    Livingroom_Lighting.off();
		
        
//      Air-conditional on
        Aircon myAircon = new Aircon(Address);
        myAircon.on(24);

        
	}
	
}
