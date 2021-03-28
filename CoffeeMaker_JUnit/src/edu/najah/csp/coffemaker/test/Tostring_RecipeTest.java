package edu.najah.csp.coffemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;

public class Tostring_RecipeTest {

	@Test
	public void testToString() {
		String expected= "";
		String actual="";
		Recipe recipe = new Recipe();
		
		actual = recipe.toString();
		assertTrue(expected == actual);
		
	}

}
