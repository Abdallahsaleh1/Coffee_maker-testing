package edu.najah.csp.coffemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class set_milk_RecipeTest {

	
	@Test
	public void testGetAmtMilk() {
		Recipe recipe = new Recipe();
		int expected = 0;
		int actual = recipe.getAmtMilk();
		assertTrue(actual == expected);
	}

	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtMilk_char() throws RecipeException,NumberFormatException{
		int expected = 0;
		int actual = 0; 
		String newmilk = "b";
		Recipe recipe = new Recipe();
		recipe.setAmtMilk(newmilk);
		
		actual = recipe.getAmtMilk();
		assertTrue(expected == actual);
	}
	
	@Test
	public void testSetAmtMilk_5() throws RecipeException,NumberFormatException{
		int expected = 5;
		int actual = 0; 
		String newmilk = "5";
		Recipe recipe = new Recipe();
		
		recipe.setAmtMilk(newmilk);
		
		actual = recipe.getAmtMilk();
		assertTrue(expected == actual);
		
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtMilk_float() throws RecipeException,NumberFormatException{
		int expected = 0;
		int actual = 0; 
		String newmilk = "1.5";
		Recipe recipe = new Recipe();
		
		recipe.setAmtMilk(newmilk);
		
		actual = recipe.getAmtMilk();
		assertTrue(expected == actual);
		
	}
	
	@Test(expected = RecipeException.class)
	public void testSetAmtMilk_negative() throws RecipeException,NumberFormatException{
		int expected = 0;
		int actual = 0; 
		String newmilk = "-5";
		Recipe recipe = new Recipe();
		
		recipe.setAmtMilk(newmilk);
		
		actual = recipe.getAmtMilk();
		assertTrue(expected == actual);
		
	}
	
	@Test
	public void testSetAmtMilk_zero() throws RecipeException,NumberFormatException{
		int expected = 0;
		int actual = 0; 
		String newmilk = "0";
		Recipe recipe = new Recipe();
		
		recipe.setAmtMilk(newmilk);
		
		actual = recipe.getAmtMilk();
		assertTrue(expected == actual);
		
	}


}
