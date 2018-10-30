package pkgShape;

import java.util.Comparator;

public class Cuboid extends Rectangle {
	
	private int iDepth;
	
	public Cuboid(int iDepth, int iLength, int iWidth)
	{
		super(iWidth, iLength);
		this.iDepth=iDepth;
	}
	
	public int getiDepth()
	{
		return iDepth;
	}
	
	public void setiDepth(int iDepth)
	{
		this.iDepth=iDepth;
	}
	
	public double volume()
	{
		return iDepth * getiLength() * getiWidth();
	}
	
	@Override
	public double area()
	{
		return 2*getiLength()*getiWidth()+2*iDepth*getiLength()+2*iDepth*getiWidth();
	}
	
	@Override
	public double perimeter()
	{
		throw new UnsupportedOperationException("Invalid operation for a cuboid.");
	}
	
	public int compareTo(Object o)
	{
		Cuboid c = (Cuboid)o;
		return (int)(c.area()-this.area());
	}
	
	public class SortByArea implements Comparator<Cuboid>
	{
		
		 SortByArea()
		 {
		 }
		 
		public int compare(Cuboid c1, Cuboid c2)
		{
			return (int)(c1.area()-c2.area());
		}
	}
		
	public class SortByVolume implements Comparator<Cuboid>
	{
		SortByVolume()
		{
		}
		public int compare(Cuboid c1, Cuboid c2) 
		{
			return (int)(c1.volume()-c2.volume());
		}
	}
}
