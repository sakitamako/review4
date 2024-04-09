package review4.sakitamako.com.github;

public class ColorTest {
	public static void main(String[] args) {
		
		ColorChart orange = new ColorChart("オレンジ", 8);
		System.out.println(orange.getColor());
		
		orange.setColor("ブラウン");
		
		System.out.println(orange.getColor());
	}

}
