package edu.najah.csp.coffemaker.test;

import static org.junit.Assert.*;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;


import org.junit.Test;

public class set_chocolate_RecipeTest {

	@Test
	public void testGetAmtChocolate() {
		Recipe recipe = new Recipe();
		int expected = 0;
		int actual = recipe.getAmtChocolate();
		assertTrue(actual == expected);
	}

	@Test(expected = NumberFormatException.class)
	public void testSetAmtChocolate_char() throws RecipeException,NumberFormatException{
		int expected = 0;
		int actual = 0; 
		String newchocolate = "b";
		Recipe recipe = new Recipe();
		
		recipe.setAmtChocolate(newchocolate);
		
		actual = recipe.getAmtChocolate();
		assertTrue(expected == actual);
		
	}
	
	@Test
	public void testSetAmtChocolate_5() throws RecipeException,NumberFormatException{
		int expected = 5;
		int actual = 0; 
		String newchocolate = "5";
		Recipe recipe = new Recipe();
		
		recipe.setAmtChocolate(newchocolate);
		
		actual = recipe.getAmtChocolate();
		assertTrue(expected == actual);
		
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtChocolate_float() throws RecipeException,NumberFormatException{
		int expected = 0;
		int actual = 0; 
		String newchocolate = "1.5";
		Recipe recipe = new Recipe();
		
		recipe.setAmtChocolate(newchocolate);
		
		actual = recipe.getAmtChocolate();
		assertTrue(expected == actual);
		
	}
	
	@Test(expected = RecipeException.class)
	public void testSetAmtChocolate_negative() throws RecipeException,NumberFormatException{
		int expected = 0;
		int actual = 0; 
		String newchocolate = "-5";
		Recipe recipe = new Recipe();
		
		recipe.setAmtChocolate(newchocolate);
		
		actual = recipe.getAmtChocolate();
		assertTrue(expected == actual);
		
	}
	
	@Test
	public void testSetAmtChocolate_zero() throws RecipeException,NumberFormatException{
		int expected = 0;
		int actual = 0; 
		String newchocolate = "0";
		Recipe recipe = new Recipe();
		
		recipe.setAmtChocolate(newchocolate);
		
		actual = recipe.getAmtChocolate();
		assertTrue(expected == actual);
		
	}
	
	

}
