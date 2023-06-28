import org.opentutorials.iot.Elevator;
import org.opentutorials.iot.Security;
import org.opentutorials.iot.Lighting;
import org.opentutorials.iot.Speaker;
import org.opentutorials.iot.Aircon;
import org.opentutorials.iot.Refrigerator;
import org.opentutorials.iot.DimmingLights;


import javax.swing.JOptionPane;


public class Ok_javaGoInHomeInput {

	public static void main(String[] args) {
        
		String Name = args[0];
		String brightness = args[1];
		
//		Elevator call
		Elevator myElevator = new Elevator(Name+ "님의 자취방의 엘레베이터 위치(현재 고장)");
		myElevator.callForDown(24);
		
//		Security off 
	    Security mySecrity= new Security(Name +"님 자취방의 도어락 전원");
	    mySecrity.off();
		
//		Light off
	    Lighting myLightining =new Lighting(Name +"님 조명전원");
	    myLightining.off();
		
//		Speaker on
        Speaker mySpeaker = new Speaker(Name + "님 방범알람 스피커");
        mySpeaker.makeVoice("굉장히 크게 울리는 중");
        
//      Air-conditional on
        Aircon myAircon = new Aircon(Name+"님 자취방의 현재 온도");
        myAircon.on(40); 
        
//     Refrigerator off
       Refrigerator myRefrigerator=new Refrigerator(Name + "님 자취방의 냉장고 전원");         
       myRefrigerator.off();
    		   
//      DimmingLights
        DimmingLights myDimmingLights= new DimmingLights(Name+"님 자취방의 무드등 밝기");
        myDimmingLights.setBright(Double.parseDouble(brightness)); 
        myDimmingLights.on();
        
	}
	
}
