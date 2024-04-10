package review4.sakitamako.com.github;

public class ColorChart {
	private String color = null;
	private int level = 0;

	public ColorChart(String color, int level) {
	this.color = color;
	this.level = level;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
