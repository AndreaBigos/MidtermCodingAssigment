package pkgTests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

import pkgShape.Cuboid;
import pkgShape.Cuboid.SortByArea;

class CuboidTests {

	@Test
	public void Cuboid_Test1() {
		Cuboid c = new Cuboid(5,4,3);
		assertTrue(c.getiDepth()==5 && c.getiLength()==4&&c.getiWidth()==3);
	}
	
	@Test
	public void Cuboid_Test2() {
		Cuboid c = new Cuboid(5,4,3);
		assertFalse(c.getiDepth()==3 && c.getiLength()==4&&c.getiWidth()==5);
	}
	
	@Test
	public void Cuboid_Test3() {
		Cuboid c = new Cuboid(1,2,3);
		assertTrue(c.getiDepth()==1 && c.getiLength()==2&&c.getiWidth()==3);
	}
	
	@Test
	public void getiDepth_Test1()
	{
		Cuboid c = new Cuboid(9,8,7);
		assertTrue(c.getiDepth()==9);
	}
	
	@Test
	public void getiDepth_Test2()
	{
		Cuboid c = new Cuboid(9,8,7);
		assertFalse(c.getiDepth()==7);
	}
	
	@Test
	public void getiDepth_Test3()
	{
		Cuboid c = new Cuboid(100,65,11);
		assertTrue(c.getiDepth()==100);
	}
	
	@Test
	public void setiDepth_Test1()
	{
		Cuboid c = new Cuboid(1,2,3);
		c.setiDepth(2);
		assertTrue(c.getiDepth()==2);
	}
	
	@Test
	public void setiDepth_Test2()
	{
		Cuboid c = new Cuboid(6,9,11);
		c.setiDepth(10);
		assertFalse(c.getiDepth()==6);
	}
	
	@Test
	public void setiDepth_Test3()
	{
		Cuboid c = new Cuboid(8,25,23);
		c.setiDepth(11);
		assertTrue(c.getiDepth()==11);
	}
	
	@Test
	public void area_Test1()
	{
		Cuboid c = new Cuboid(1,2,3);
		assertTrue(c.area()==22);
	}
	
	@Test
	public void area_Test2()
	{
		Cuboid c = new Cuboid(5,4,3);
		assertFalse(c.area()==1);
	}
	
	@Test
	public void area_Test3()
	{
		Cuboid c = new Cuboid(5,4,3);
		assertTrue(c.area()==94);
	}
	
	@Test
	public void perimeter_Test1()
	{
		boolean thrown = false;
		Cuboid c = new Cuboid(1,2,3);
		  try {
		    c.perimeter();
		  } catch (UnsupportedOperationException e) {
		    thrown = true;
		  }

		  assertTrue(thrown);
	}
	
	@Test
	public void perimeter_Test2()
	{
		boolean thrown = false;
		Cuboid c = new Cuboid(5,6,5);
		  try {
		    c.perimeter();
		  } catch (UnsupportedOperationException e) {
		    thrown = true;
		  }

		  assertTrue(thrown);
	}
	
	@Test
	public void perimeter_Test3()
	{
		boolean thrown = false;
		Cuboid c = new Cuboid(0,0,0);
		  try {
		    c.perimeter();
		  } catch (UnsupportedOperationException e) {
		    thrown = true;
		  }

		  assertTrue(thrown);
	}
	
	@Test
	public void compareTo_Test1()
	{
		Cuboid c1=new Cuboid(1,2,3);
		Cuboid c2= new Cuboid(4,5,6);
		if(c1.compareTo(c2)<0)
			System.out.println("The first cuboid has a larger area.");
		if(c1.compareTo(c2)>0)
			System.out.println("The second cuboid has a larger area.");
		assertTrue(c1.compareTo(c2)>0);
	}
	
	@Test
	public void compareTo_Test2()
	{
		Cuboid c1=new Cuboid(1,2,3);
		Cuboid c2= new Cuboid(1,2,3);
		if(c1.compareTo(c2)<0)
			System.out.println("The first cuboid has a larger area.");
		if(c1.compareTo(c2)>0)
			System.out.println("The second cuboid has a larger area.");
		if(c1.compareTo(c2)==0)
			System.out.println("The cuboids have the same area.");
		assertTrue(c1.compareTo(c2)==0);
	}
	
	@Test
	public void compareTo_Test3()
	{
		Cuboid c1=new Cuboid(4,5,6);
		Cuboid c2= new Cuboid(1,2,3);
		if(c1.compareTo(c2)<0)
			System.out.println("The first cuboid has a larger area.");
		if(c1.compareTo(c2)>0)
			System.out.println("The second cuboid has a larger area.");
		assertTrue(c1.compareTo(c2)<0);
	}
	
}
