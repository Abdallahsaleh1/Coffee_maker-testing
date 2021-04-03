package edu.najah.csp.coffemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;
import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class set_coffee_RecipeTest {

	@Test
	public void testGetAmtCoffee() {
		Recipe recipe = new Recipe();
		int expected = 0;
		int actual = recipe.getAmtCoffee();
		assertTrue(actual == expected);
	}

	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtCoffee_char() throws RecipeException,NumberFormatException{
		int expected = 0;
		int actual = 0; 
		String newcoffee = "b";
		Recipe recipe = new Recipe();
		recipe.setAmtCoffee(newcoffee);
		
		actual = recipe.getAmtCoffee();
		assertTrue(expected == actual);
	}
	
	@Test
	public void testSetAmtCoffee_5() throws RecipeException,NumberFormatException{
		int expected = 5;
		int actual = 0; 
		String newcoffee = "5";
		Recipe recipe = new Recipe();
		
		recipe.setAmtCoffee(newcoffee);
		
		actual = recipe.getAmtCoffee();
		assertTrue(expected == actual);
		
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtCoffee_float() throws RecipeException,NumberFormatException{
		int expected = 0;
		int actual = 0; 
		String newcoffee = "1.5";
		Recipe recipe = new Recipe();
		
		recipe.setAmtCoffee(newcoffee);
		
		actual = recipe.getAmtCoffee();
		assertTrue(expected == actual);
		
	}
	
	@Test(expected = RecipeException.class)
	public void testSetAmtCoffee_negative() throws RecipeException,NumberFormatException{
		int expected = 0;
		int actual = 0; 
		String newcoffee = "-5";
		Recipe recipe = new Recipe();
		
		recipe.setAmtCoffee(newcoffee);
		
		actual = recipe.getAmtCoffee();
		assertTrue(expected == actual);
		
	}
	
	@Test
	public void testSetAmtCoffee_zero() throws RecipeException,NumberFormatException{
		int expected = 0;
		int actual = 0; 
		String newcoffee = "0";
		Recipe recipe = new Recipe();
		
		recipe.setAmtCoffee(newcoffee);
		
		actual = recipe.getAmtCoffee();
		assertTrue(expected == actual);
		
	}

}
