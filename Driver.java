package ClassesAndInterfaces;


/**
 * This is the driver for the Money, Date, and Bill class but it is 
 * implementing interfaces. 
 * 
 * Note: The JUnit doesn't work because for some reason, and it gives me an 
 * error: "The method clone() from the type Object is not visible" and it gives
 * me "The method compareTo() from the type Object is not visible", even though
 * I have overridden the clone() and the compare method and made it public. I 
 * also did implement the Comparable, Cloneable, and Serializable. 
 * 
 * I have tried for hours looking at this code, but when I tried working in main,
 * everything works.
 * 
 * I decided to put everything in the driver because all the methods work, but
 * its just that it doesn't work in the JUnit. The only method that works in 
 * the JUnit is the compareTo method but only for the Date class and nothing 
 * else
 * 
 * @author Sung Ho Park
 * @version 1.0
 * Class: CSS 143 B 
 * Assignment: Class Interfaces
 *
 */
public class Driver
{
	/**
	 * Main driver instead of JUnit because JUnit doesn't work.
	 * @param arg
	 */
	public static void main(String[] arg)
	{
		//This will test the clone method for Money, Bill, and Date class.
		Money money1 = new Money(57, 89);
		System.out.println("This is the original money: " + 
												money1.toString());
		Money money2 = (Money) money1.clone();
		System.out.println("This is the copied money: " + money2.toString() +
														"\n");
		
		Date date = new Date(12, 12, 2017);
		System.out.println("This is the original date: " + date.toString());
		Date date2 = (Date) date.clone();
		System.out.println("This is the copied date: " + date2.toString() + "\n");
		
		Money money3 = new Money(29, 80);
		Date date3 = new Date(4, 15, 2019);
		Bill bill1 = new Bill(money3, date3, "Some Company");
		System.out.println("This is the original Bill: " +
					bill1.getAmount() + " " + bill1.getDueDate() + " " +
					bill1.getOriginator());
		Bill bill2 = (Bill) bill1.clone();
		System.out.println("This is the copied Bill: " +
					bill1.getAmount() + " " + bill1.getDueDate() + " " +
					bill1.getOriginator() + "\n");
		
		System.out.println("Here is a series of compareTo results.");
		//Tests the compareTo method for Money, Date and Bill class
		System.out.println("\nHere is the Money class Comparable: ");
		Money m1 = new Money(12, 00);
		Money m2 = new Money(12, 01);
		Money m3 = new Money(11, 99);
		Money m4 = (Money)m1.clone();
		
		System.out.println(m1.compareTo(m2)); //Returns -1: m1 comes before m2.
		System.out.println(m1.compareTo(m3)); //Returns 1: m1 comes after m3.
		System.out.println(m1.compareTo(m4)); //Returns 0: m1 is equal to m4.
		System.out.println("\nHere is the Date Class Compareable: ");
		
		Date d1 = new Date(12, 12, 2017);
		Date d2 = new Date(12, 12, 2016);
		Date d3 = new Date(12, 12, 2018);
		Date d4 = (Date)d1.clone();
		
		System.out.println(d1.compareTo(d2)); //Returns 1: d1 comes after d2.
		System.out.println(d1.compareTo(d3)); //Returns -1: d1 comes before d3.
		System.out.println(d1.compareTo(d4)); //Returns 0: d1 is equal to d4.
		
		Date d5 = new Date(12, 12, 2017);
		Date d6 = new Date(12, 11, 2017);
		Date d7 = new Date(12, 13, 2017);
		
		System.out.println(d5.compareTo(d6)); //Returns 1: d5 comes after d6.
		System.out.println(d5.compareTo(d7)); //Returns -1: d5 comes before d7.
		
		Date d8 = new Date(8, 12, 2017);
		Date d9 = new Date(9, 12, 2017);
		Date d0 = new Date(5, 12, 2017);
		
		System.out.println(d8.compareTo(d9)); //Returns -1: d8 comes before d9.
		System.out.println(d8.compareTo(d0)); //Returns 1: d8 comes after d0.
		System.out.println("\nHere is the Bill Class Compareable: ");
		
		Money bm1 = new Money(12, 50);
		Date bd1 = new Date(2, 12, 2020);
		Bill b1 = new Bill(bm1, bd1, "S");
		Bill b2 = (Bill)b1.clone();
		
		System.out.println(b1.compareTo(b2)); //return 0
		
		Money bm2 = new Money(11, 50);
		Date bd2 = new Date(2, 13, 2020);
		Bill b3 = new Bill(bm2, bd2, "S");
		
		
		System.out.println(b1.compareTo(b3)); //return 1 because it checks 
												//Money first.
		
		Money bm3 = new Money(14, 50);
		Date bd3 = new Date(2, 13, 2020);
		Bill b4 = new Bill(bm3, bd3, "S");
		
		System.out.println(b1.compareTo(b4)); //return -1 because it checks 
												//Money first.
		
		
	}
}
