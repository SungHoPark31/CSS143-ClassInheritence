package ClassesAndInterfaces;

import java.util.Iterator;

/**
 * This is the extra credit assignment on Iterators.
 * 
 * @author Sung Ho Park
 * Class: CSS 143 B
 * Assignment: Class Interface
 *
 */
public class IteratorClass implements Iterator<Object>
{

	//Instance variables
	private int startPosition = 0;
	private ArrayList list;
	
	/**
	 * Constructor that takes in an Object array and set it 
	 * to the ArrayList class
	 * @param array
	 */
	public IteratorClass(Object[] array)
	{
		//Make a new Object array that will make a temporary array.
		Object[] a = array;
		
		//Make a new ArrayList() for the list instance variable. 
		this.list = new ArrayList();
		
		//Copy each value in the a array to the list.
		for(int i = 0; i < a.length; i++)
		{
			this.list.insert(a[i]);
		}
	}
	
	@Override
	/**
	 * This test if there is a next value in the array you just passed
	 * @return true or false.
	 */
	public boolean hasNext() 
	{
		//Return false if the size of the list is less than or equal to 
		//the starting position after incrementing. True otherwise
		if(list.size() <= startPosition)
		{
			return false;
		}
		return true;
	}

	@Override
	/**
	 * This will return the position and increment the index every time it 
	 * is called. 
	 * 
	 * @return Object
	 */
	public Object next()
	{
		//Get current position of list
		Object val = list.get(startPosition);
		//Increment startPosition
		startPosition++;
		return val;
	}
	
}
