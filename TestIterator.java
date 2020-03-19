package ClassesAndInterfaces;

import java.util.Iterator;

/**
 * This is the extra credit for the Interface.
 * 
 * This tests the Iterator and prints out the values in the ArrayList
 * 
 * @author Sung Ho Park
 * Class: CSS 143 B
 * Assignment: Class Interface
 *
 */
public class TestIterator
{
	public static void main(String[] arg)
	{
		//Make an array and put values in it.
		ArrayList something = new ArrayList();
		something.insert("Something");
		something.insert("Turtles");
		something.insert("T");
		
		//Make an instance of the class Iterator and name it it.
		//something.iterator() method pretty much copies "something" into "it".
		Iterator<Object> it = something.iterator();
		
		//While the object it has a next print it out.
		while(it.hasNext())
		{
			//TypeCast because the values that we put in were String.
			String obj = (String)it.next();
			System.out.println(obj);
			//This will print out the elements in the array and a bunch of nulls.
			
			//The reason why it prints out 7 other nulls is because my
			//ArrayList object has a fixed size of 10. Therefore, when I have 
			//added 3 elements to the object "something" there will be 7 
			//left over nulls.
		}
		
	}
}
