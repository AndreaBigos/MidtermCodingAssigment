package pkgTests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkgShape.Rectangle;

class RectangleTests {

	@Test
	public void Rectanlge_Test1() {
		Rectangle r = new Rectangle(5,4);
		assertTrue(r.getiWidth() ==5&&r.getiLength()==4);
	}
	
	@Test
	public void Rectanlge_Test2() {
		Rectangle r = new Rectangle(5,4);
		assertFalse(r.getiWidth() ==4&&r.getiLength()==5);
	}
	
	@Test
	public void Rectanlge_Test3() {
		Rectangle r = new Rectangle(7,6);
		assertTrue(r.getiWidth() ==7&&r.getiLength()==6);
	}
	
	@Test
	public void getiWidth_Test1() {
		Rectangle r = new Rectangle(10,15);
		assertTrue(r.getiWidth() ==10);
	}

	@Test
	public void getiWidth_Test2() {
		Rectangle r = new Rectangle(10,15);
		assertFalse(r.getiWidth() ==15);
	}
	
	@Test
	public void getiWidth_Test3() {
		Rectangle r = new Rectangle(77,99);
		assertTrue(r.getiWidth() ==77);
	}
	
	@Test
	public void getiLength_Test1() {
		Rectangle r = new Rectangle(1,2);
		assertTrue(r.getiLength() ==2);
	}
	
	@Test
	public void getiLength_Test2() {
		Rectangle r = new Rectangle(1,2);
		assertFalse(r.getiLength() ==1);
	}
	
	@Test
	public void getiLength_Test3() {
		Rectangle r = new Rectangle(11,32);
		assertTrue(r.getiLength() ==32);
	}
	
	@Test
	public void setiWidth_Test1() {
		Rectangle r = new Rectangle(3, 5);
		r.setiWidth(2);
		assertTrue(r.getiWidth() ==2);
	}
	
	@Test
	public void setiWidth_Test2() {
		Rectangle r = new Rectangle(11, 514);
		r.setiWidth(5);
		assertFalse(r.getiWidth() ==11);
	}
	
	@Test
	public void setiWidth_Test3() {
		Rectangle r = new Rectangle(1, 2);
		r.setiWidth(100);
		assertTrue(r.getiWidth() ==100);
	}
	
	@Test
	public void setiLength_Test1() {
		Rectangle r = new Rectangle(1,2);
		r.setiLength(5);
		assertTrue(r.getiLength() ==5);
	}
	
	@Test
	public void setiLength_Test2() {
		Rectangle r = new Rectangle(5,11);
		r.setiLength(5);
		assertFalse(r.getiLength() ==11);
	}
	
	@Test
	public void setiLength_Test3() {
		Rectangle r = new Rectangle(25,63);
		r.setiLength(1);
		assertTrue(r.getiLength() ==1);
	}
	
	@Test
	public void area_Test1()
	{
		Rectangle r = new Rectangle(5,4);
		assertTrue(r.area()==20);
	}
	
	@Test
	public void area_Test2()
	{
		Rectangle r = new Rectangle(11,2);
		assertFalse(r.area()==21);
	}
	
	@Test
	public void area_Test3()
	{
		Rectangle r = new Rectangle(11,2);
		assertTrue(r.area()==22);
	}
	
	@Test
	public void perimeter_Test1()
	{
		Rectangle r = new Rectangle(5,4);
		assertTrue(r.perimeter()==18);
	}
	
	@Test
	public void perimeter_Test2()
	{
		Rectangle r = new Rectangle(3,2);
		assertFalse(r.perimeter()==9);
	}
	
	@Test
	public void perimeter_Test3()
	{
		Rectangle r = new Rectangle(10,10);
		assertTrue(r.perimeter()==40);
	}
	
	@Test
	public void compareTo_Test1()
	{
		Rectangle r1 = new Rectangle(10,10);
		Rectangle r2 = new Rectangle(11,10);
		if(r1.compareTo(r2)<0)
			System.out.println("The first rectangle has a larger area.");
		if(r1.compareTo(r2)>0)
			System.out.println("The second rectangle has a larger area.");
		assertTrue(r1.compareTo(r2)>0);
	}
	
	@Test
	public void compareTo_Test2()
	{
		Rectangle r1 = new Rectangle(10,10);
		Rectangle r2 = new Rectangle(10,10);
		if(r1.compareTo(r2)<0)
			System.out.println("The first rectangle has a larger area.");
		if(r1.compareTo(r2)>0)
			System.out.println("The second rectangle has a larger area.");
		if(r1.compareTo(r2)==0)
			System.out.println("The rectangles have the same area.");
		assertTrue(r1.compareTo(r2)==0);
	}
	
	@Test
	public void compareTo_Test3()
	{
		Rectangle r1 = new Rectangle(10,10);
		Rectangle r2 = new Rectangle(8,10);
		if(r1.compareTo(r2)<0)
			System.out.println("The first rectangle has a larger area.");
		if(r1.compareTo(r2)>0)
			System.out.println("The second rectangle has a larger area.");
		if(r1.compareTo(r2)==0)
			System.out.println("The rectangles have the same area.");
		assertTrue(r1.compareTo(r2)<0);
	}
}
