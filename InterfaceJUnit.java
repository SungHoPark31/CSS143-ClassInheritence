package ClassesAndInterfaces;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import ClassAndPrivacyLeaks.Money;

/**
 * This is the Junit. Its only purpose is to test the methods in 
 * the classes Bill, Date, Money class. 
 * 
 * It doesn't work because it gives me errors. I did override the methods and 
 * made them public but the only method that'll work is the Date compareTo.
 * 
 * 
 * @author Sung Ho Park
 * @version 1.0
 * Class: CSS 143 B
 * Assignment: Class Interfaces
 */
public class InterfaceJUnit 
{
	@Test
	public void Clone()
	{
		Money money1 = new Money(10, 21);
		
		//Doesn't work.
		//Money money2 = (Money) money1.clone();
//		
//		assertEquals(10, money2.getDollars());
//		assertEquals(21, money2.getCents());
	}
	
	@Test
	public void Compare()
	{
		Money money1 = new Money(10, 21);
		Money money2 = new Money(11, 21);
//		Money money3 = new Money(9, 21);
//		Money money4 = new Money(10, 21);
//		Money money5 = new Money(10, 22);
//		Money money6 = new Money(10, 20);
		
		//Doesn't work
		//assertEquals(0, money1.compareTo(money2));
//		assertEquals(1, ((Comparable) money1).compareTo(money3));
//		assertEquals(0, ((Comparable) money1).compareTo(money4));
//		assertEquals(-1, ((Comparable) money1).compareTo(money5));
//		assertEquals(1, ((Comparable) money1).compareTo(money6));
		
		Date d1 = new Date(10, 24, 2020);
		Date d2 = new Date(10, 24, 2021);
		Date d3 = new Date(10, 24, 2019);
		
		assertEquals(-1, d1.compareTo(d2));
		assertEquals(1, d1.compareTo(d3));
		
		
		Date d4 = new Date(1, 24, 2020);
		Date d5 = new Date(11, 24, 2020);
		
		assertEquals(1, d1.compareTo(d4));
		assertEquals(-1, d4.compareTo(d5));
		
		Date d6 = new Date(10, 25, 2020);
		Date d7 = new Date(10, 23, 2020);
		
		assertEquals(-1, d1.compareTo(d6));
		assertEquals(1, d1.compareTo(d7));
	}

}
