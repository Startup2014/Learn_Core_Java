package Pap_pal_using_webdriver_selenium;


import org.testng.annotations.Test;
//import org.testng.*;
import org.testng.annotations.*;

@Test
public class TestNgTest {
	
	@BeforeMethod
	public void Beformethod()
	{
		System.out.println("hello TestNg --before method");
	}
	
	@Test
	public void print()
	{
		System.out.println("hello TestNg");
	}

}
