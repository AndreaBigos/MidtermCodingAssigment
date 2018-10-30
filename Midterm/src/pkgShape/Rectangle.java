package pkgShape;

public class Rectangle extends Shape {
	private int iWidth;
	private int iLength;
	
	public Rectangle(int iWidth, int iLength)
	{
		this.iWidth = iWidth;
		this.iLength = iLength;
	}
	
	public int getiWidth()
	{
		return iWidth;
	}
	
	public void setiWidth(int iWidth)
	{
		this.iWidth=iWidth;
	}
	
	public int getiLength()
	{
		return iLength;
	}
	
	public void setiLength(int iLength)
	{
		this.iLength=iLength;
	}

	public double area() {
		return iLength * iWidth;
	}

	public double perimeter() {
		return iLength*2+iWidth*2;
	}
	
	public int compareTo(Object o)
	{
		Rectangle r = (Rectangle)o;
		return (int)(r.area()-this.area());
	}
}
