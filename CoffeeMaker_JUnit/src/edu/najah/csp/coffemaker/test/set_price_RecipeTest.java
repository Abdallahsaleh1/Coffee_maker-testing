package edu.najah.csp.coffemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class set_price_RecipeTest {


	@Test
	public void testGetPrice() {
		Recipe recipe = new Recipe();
		double expected = 0;
		double actual = recipe.getAmtChocolate();
		assertTrue(actual == expected);
	}

	@Test(expected = NumberFormatException.class)
	public void testSetPrice_char() throws RecipeException,NumberFormatException{
		double expected = 0;
		double actual = 0; 
		String newprice = "s";
		Recipe recipe = new Recipe();
		
		recipe.setPrice(newprice);
		actual = recipe.getPrice();
		assertTrue(expected == actual);
		
	}
	
	@Test
	public void testSetPrice_2() throws RecipeException,NumberFormatException{
		double expected = 2;
		double actual = 0; 
		String newprice = "2";
		Recipe recipe = new Recipe();
		
		recipe.setPrice(newprice);
		
		actual = recipe.getPrice();
		assertTrue(expected == actual);
		
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetPrice_double() throws RecipeException,NumberFormatException{
		double expected = 0;
		double actual = 0; 
	    String newsugar = "1.5";
		Recipe recipe = new Recipe();
		
		recipe.setAmtSugar(newsugar);
		
		actual = recipe.getAmtSugar();
		assertTrue(expected == actual);
		
	}
	
	@Test
	public void testSetPrice_negative() throws RecipeException,NumberFormatException{
		double expected = 0;
		double actual = 0; 
		String newprice = "-5";
		Recipe recipe = new Recipe();
		
		recipe.setPrice(newprice);
		
		actual = recipe.getPrice();
		assertTrue(expected == actual);
		
	}
	
	@Test
	public void testSetPrice_zero() throws RecipeException,NumberFormatException{
		double expected = 0;
		double actual = 0; 
		String newprice = "0";
		Recipe recipe = new Recipe();
		
		recipe.setPrice(newprice);
		
		actual = recipe.getPrice();
		assertTrue(expected == actual);
		
	}


}
