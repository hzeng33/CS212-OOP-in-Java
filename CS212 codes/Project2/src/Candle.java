/**
 * Define the candle class to have 4 private instances.
 * @author Hannah Zeng
 * Lab section:11D
 *
 */

public class Candle {
	private int height;
	private int width;
    private float price;
	private boolean candleLitOrNot;
	
	/**
	 * Construct a candle object
	 * @param newHeight:The height of a candle
	 * @param newWidth:The width of a candle
	 * @param newPrice:The price of a candle
	 */
	public Candle(int newHeight, int newWidth, float newPrice) {
		height=newHeight;
		width=newWidth;
		price=newPrice;
		candleLitOrNot=false;//assume a constructed candle is not lit.
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int newHeight2) {
		this.height=newHeight2;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public float getPrice() {
		return price;
	}

	public void setPrise(float price) {
		this.price = price;
	}

	public boolean isCandleLitOrNot() {
		return candleLitOrNot;
	}

	public void setCandleLitOrNot(boolean candleLitOrNot) {
		this.candleLitOrNot = candleLitOrNot;
	}
	
	@Override
	public String toString() {
		return height+","+width+","+price;
	}
	

}
