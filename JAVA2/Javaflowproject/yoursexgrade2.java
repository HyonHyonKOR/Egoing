import javax.swing.JOptionPane;

public class yoursexgrade2 {

	public static void main(String[] args) { 
	    
	    String 이름= JOptionPane.showInputDialog("Hey,You!yes..yes you!\n지금부터 당신의 섹스 그레이드를 평가하겠습니다.\n당신의 이름을 입력해주세요.");
	    int 경험인수= Integer.parseInt(JOptionPane.showInputDialog (이름+"님의 현재까지의 경험 인수를 적어주세요(3명의 경우, 3이라고 입력해주세요)"));
	          
        if(경험인수 < 0) { 
            JOptionPane.showMessageDialog(null, "입력 오류입니다 혹은 "+이름+"님은 아직 난자와도 섹스못한 정자 수준의 사람입니다. 프로그램을 재시동해주세요.","에러",JOptionPane.ERROR_MESSAGE);
        }
        else if(경험인수 == 0) {
            JOptionPane.showMessageDialog(null, 이름+"님은 아다입니다. 마법학교 호그와트에 어서오세요.쪢쮸♡",null,JOptionPane.PLAIN_MESSAGE);
        }
        else if (경험인수 == 1)  {
        	int 성매매경험횟수= Integer.parseInt(JOptionPane.showInputDialog (이름+"님이 지금까지 경험한 성매매 경험은 몇 회입니까?(3번의 경우, 3이라고 입력해주세요) ")); 	
        	if(경험인수==1 && 성매매경험횟수>경험인수||성매매경험횟수<0) {JOptionPane.showMessageDialog(null,"개소리 말고 재기동해서 다시 작성하세요.","에러",JOptionPane.ERROR_MESSAGE);}
        	else if(경험인수== 1 && 성매매경험횟수==0)  {JOptionPane.showMessageDialog(null,이름+"님은 자라나는 섹린이입니다. 어서 밖으로 나가서 당신의 씨앗을 뿌리세요",null,JOptionPane.PLAIN_MESSAGE);}
        	else if(경험인수== 1 && 성매매경험횟수==1) {JOptionPane.showMessageDialog(null,이름+"님은 반다입니다. 불완전한 섹린이이므로 얼른 연애를 통해 해결하세요",null,JOptionPane.PLAIN_MESSAGE);} 
        }
        else if (경험인수 == 2) 
        {
        	int 성매매경험횟수= Integer.parseInt(JOptionPane.showInputDialog (이름+"님이 지금까지 경험한 성매매 경험은 몇 회입니까?(3번의 경우, 3이라고 입력해주세요) ")); 	
        	if(경험인수==2 && 성매매경험횟수>경험인수||성매매경험횟수<0) {JOptionPane.showMessageDialog(null,"개소리 말고 재기동해서 다시 작성하세요.",null,JOptionPane.PLAIN_MESSAGE);}
        	else if(경험인수== 2 && 성매매경험횟수==0) {System.out.println(이름+"님은 아직 섹린이입니다. 밖으로 나가서 당신의 씨앗을 더더더 뿌리세요");}
        	else if(경험인수== 2 && 성매매경험횟수==1) {System.out.println(이름+"님은 불완전한 섹린이입니다.혹시 첫 경험은 어디서 땟나요? 의심이 되네요.");}
        	else if(경험인수== 2 && 성매매경험횟수==2) {System.out.println(이름+"님은 자라나는 성매매충의 새싹입니다. 연애를 하세요. 그러다 탈나요.");}
        }
        else if (경험인수 == 3) 
        {
        	
            int 성매매경험횟수= Integer.parseInt(JOptionPane.showInputDialog (이름+"님이 지금까지 경험한 성매매 경험은 몇 회입니까?(3번의 경우, 3이라고 입력해주세요) ")); 
        	if(경험인수==3 && 성매매경험횟수>경험인수||성매매경험횟수<0) {JOptionPane.showMessageDialog(null,"개소리 말고 재기동해서 다시 작성하세요.",null,JOptionPane.PLAIN_MESSAGE);}
        	else if(경험인수==3 && 성매매경험횟수==0) {System.out.println(이름+"님은 섹린이 졸업반입니다. 그럭저럭의 인생을 보내셨네요.");}
        	else if(경험인수==3 && 성매매경험횟수==1) {System.out.println(이름+"님은 상병급 섹린이입니다.근데 혹시 첫 경험이 조금 의심되네요.");}
        	else if(경험인수==3 && 성매매경험횟수>=2) {System.out.println(이름+"님은 성매매충의 유충입니다.그렇게 하고 싶으셨나요?");}

        }
        else if (경험인수 == 4)         
        {
        	int 성매매경험횟수= Integer.parseInt(JOptionPane.showInputDialog (이름+"님이 지금까지 경험한 성매매 경험은 몇 회입니까?(3번의 경우, 3이라고 입력해주세요) ")); 
        	if(경험인수==4 && 성매매경험횟수>경험인수||성매매경험횟수<0) {JOptionPane.showMessageDialog(null,"개소리 말고 재기동해서 다시 작성하세요.",null,JOptionPane.PLAIN_MESSAGE);}
        	else if(경험인수==4 && 성매매경험횟수==0) {System.out.println(이름+"님은 일반인입니다. 드라마로 치면 배경 캐릭터같은 인생이군요.");}
        	else if(경험인수==4 && 성매매경험횟수==1) {System.out.println(이름+"님은 일반입니다만...양심에 찔리는 게 있지 않나요?");}
        	else if(경험인수==4 && 성매매경험횟수==2) {System.out.println(이름+"님은 일반인인척 하는 사람입니다만...당신의 섹스의 절반은?");}
        	else if(경험인수==4 && 성매매경험횟수>=3) {System.out.println(이름+"님은 성매매충의 번데기입니다. 구지 비유하자면 버터풀로 진화하기 전의 단데기죠.");}

        }  
        else if (경험인수 == 5)
        {
        
        	int 성매매경험횟수= Integer.parseInt(JOptionPane.showInputDialog (이름+"님이 지금까지 경험한 성매매 경험은 몇 회입니까?(3번의 경우, 3이라고 입력해주세요) ")); 
        	if(경험인수==5 && 성매매경험횟수>경험인수||성매매경험횟수<0) {JOptionPane.showMessageDialog(null,"개소리 말고 재기동해서 다시 작성하세요.",null,JOptionPane.PLAIN_MESSAGE);}
        	else if(경험인수==5 && 성매매경험횟수==0) {System.out.println(이름+"님은 일반인입니다. 대학생 때 한두번 연애는 해보셨겠네요.");}
        	else if(경험인수==5 && 성매매경험횟수==1) {System.out.println(이름+"님은 일반입니다만 호기심이 왕성한 일반입니다.많이 궁금하셨나보네요");}
        	else if(경험인수==5 && 성매매경험횟수==2) {System.out.println(이름+"님은 일코 중인 성매매충의 유충입니다.40%는 좀 아니죠?");}
        	else if(경험인수==5 && 성매매경험횟수>=3&&성매매경험횟수<5) {System.out.println(이름+"님은 일코 중인 성매매충의 번데기입니다. 상대방이 불쌍하네요");}
        	else if(경험인수==5 && 성매매경험횟수==경험인수) {System.out.println(이름+"님은 갓 알에서 꺠어난 성매매충입니다. 축하드립니다! ");}

        } 
        else if (경험인수 >=6&&경험인수<9)
        {
        
        	int 성매매경험횟수= Integer.parseInt(JOptionPane.showInputDialog (이름+"님이 지금까지 경험한 성매매 경험은 몇 회입니까?(3번의 경우, 3이라고 입력해주세요) ")); 
        	if(경험인수==6 && 성매매경험횟수>경험인수||성매매경험횟수<0) {JOptionPane.showMessageDialog(null,"개소리 말고 재기동해서 다시 작성하세요.",null,JOptionPane.PLAIN_MESSAGE);}
        	else if(경험인수>=6&&경험인수<9 && 성매매경험횟수==0) {System.out.println(이름+"님은 S급 리얼충입니다.대학 시절에 꽤나 연애도 했겠군요. ");}
        	else if(경험인수>=6&&경험인수<9 && 성매매경험횟수==1) {System.out.println(이름+"님은 A급 리얼충입니다. 꽤 인기도 있었겠네요.한 두번의 호기심은 조심하세요. ");}
        	else if(경험인수>=6&&경험인수<9 && 성매매경험횟수==2) {System.out.println(이름+"님은 유흥충입니다.매매충까지는 아니여도 이제 거기까지만 하세요. ");}
        	else if(경험인수>=6&&경험인수<9 && 성매매경험횟수>=3&&성매매경험횟수<5) {System.out.println(이름+"님은 성매매충입니다. 아직 아기레벨이지만요.  ");}
        	else if(경험인수>=6&&경험인수<9 && 성매매경험횟수==5&&성매매경험횟수<=9) {System.out.println(이름+"님은 어엿한 성매매충입니다. 참 대단하십니다.  ");}
        	else if(경험인수==5 && 성매매경험횟수==경험인수) {System.out.println(이름+"님은 구데기입니다! ");}

        }        
       
	    
       
	
	
	
	}
}