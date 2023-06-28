
public class Number {

	public static void main(String[] args) {
		System.out.println(6 + 6);//12 掛け算
		System.out.println(9 - 5);//4　引き算
		System.out.println(4 * 7);//28　掛け算
		System.out.println(9 / 3);//3　割り算

		System.out.println(Math.PI);//3.141592653589793
		System.out.println(Math.floor(Math.PI));//3.0 floor 小数点以下を切り捨てる
		System.out.println(Math.floor(3.0));
		System.out.println(Math.floor(2.9));
		System.out.println(Math.floor(-5.4));
		
	    System.out.println(Math.sqrt(2));//1.4142135623730951  ある数字の平方根を表す。
		System.out.println(Math.min(9, 5)); //5 より小さい数字を返す。
		System.out.println(Math.max(9, 5));//9 より大きな数字を返す。
		
		
		System.out.println(Math.ceil(Math.PI));//4.0 ceil 与えた数以上の最小の整数を返す。
		System.out.println(Math.ceil(2.0));
		System.out.println(Math.ceil(2.1));
		System.out.println(Math.ceil(-5.4));
		
		
	}

}
