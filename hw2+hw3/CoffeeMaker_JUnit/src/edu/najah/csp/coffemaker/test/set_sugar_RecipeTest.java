package edu.najah.csp.coffemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class set_sugar_RecipeTest {


	
	@Test
	public void testGetAmtSugar() {
		Recipe recipe = new Recipe();
		int expected = 0;
		int actual = recipe.getAmtSugar();
		assertTrue(actual == expected);
	}

	@Test(expected = NumberFormatException.class)
	public void testSetAmtSugar_char() throws RecipeException,NumberFormatException{
		int expected = 0;
		int actual = 0; 
		String newsugar = "s";
		Recipe recipe = new Recipe();
		
		recipe.setAmtSugar(newsugar);
		
		actual = recipe.getAmtSugar();
		assertTrue(expected == actual);
		
	}
	
	@Test
	public void testSetAmtSugar_2() throws RecipeException,NumberFormatException{
		int expected = 2;
		int actual = 0; 
		String newsugar = "2";
		Recipe recipe = new Recipe();
		
		recipe.setAmtSugar(newsugar);
		
		actual = recipe.getAmtSugar();
		assertTrue(expected == actual);
		
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtSugar_float() throws RecipeException,NumberFormatException{
		int expected = 0;
		int actual = 0; 
		String newsugar = "1.5";
		Recipe recipe = new Recipe();
		
		recipe.setAmtSugar(newsugar);
		
		actual = recipe.getAmtSugar();
		assertTrue(expected == actual);
		
	}
	
	@Test(expected = RecipeException.class)
	public void testSetAmtSugar_negative() throws RecipeException,NumberFormatException{
		int expected = 0;
		int actual = 0; 
		String newsugar = "-5";
		Recipe recipe = new Recipe();
		
		recipe.setAmtSugar(newsugar);
		
		actual = recipe.getAmtSugar();
		assertTrue(expected == actual);
		
	}
	
	@Test
	public void testSetAmtSugar_zero() throws RecipeException,NumberFormatException{
		int expected = 0;
		int actual = 0; 
		String newsugar = "0";
		Recipe recipe = new Recipe();
		
		recipe.setAmtSugar(newsugar);
		
		actual = recipe.getAmtSugar();
		assertTrue(expected == actual);
		
	}

}
